package ideanoval.service;

import ideanoval.business.Alert;

public interface AlertInterface {
	public boolean createAlert (Alert alert);
	public boolean deleteAlert (int idAlert);
	public int maxIdAlert();
	public boolean setIsDone(int id_Alert, boolean isDone);
}
