package daoimpl;

import javax.persistence.EntityManager;

public interface TransactionTools {
	
	public void OpenTransactionImpl(EntityManager em);
	
	public void CloseTransaction(EntityManager em);
	

}
