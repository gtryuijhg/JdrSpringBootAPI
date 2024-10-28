package gregoire.jdr.service.commons;

import org.apache.commons.lang3.mutable.MutableObject;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

@Service
public class TransactionHelper {

	private PlatformTransactionManager platformTransactionManager;
	
	private DefaultTransactionDefinition definition = new DefaultTransactionDefinition();
	
	public TransactionHelper(PlatformTransactionManager platformTransactionManager) {
		this.platformTransactionManager = platformTransactionManager;
	}
	
	public MutableObject<TransactionStatus> beginTransaction() {
		return beginTransaction(null);
	}
	
	public MutableObject<TransactionStatus> beginTransaction(DefaultTransactionDefinition pDefinition) {
		DefaultTransactionDefinition vDefinition = pDefinition != null ? pDefinition : definition;
		TransactionStatus vStatus = platformTransactionManager.getTransaction(vDefinition);
		return new MutableObject<TransactionStatus>(vStatus);
	}
	
	public void commit(MutableObject<TransactionStatus> pStatus) {
		if (pStatus != null && pStatus.getValue() != null) {
			pStatus.setValue(null);
			platformTransactionManager.commit(pStatus.getValue());
		}
	}
	
	public void rollback(MutableObject<TransactionStatus> pStatus) {
		if (pStatus != null && pStatus.getValue() != null) {
			pStatus.setValue(null);
			platformTransactionManager.rollback(pStatus.getValue());
		}
	}
}
