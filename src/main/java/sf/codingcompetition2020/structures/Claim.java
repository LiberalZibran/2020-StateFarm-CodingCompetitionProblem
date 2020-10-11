package sf.codingcompetition2020.structures;

public class Claim {
	private int claimId;
	private int customerId;
	private boolean closed;
	private int monthsOpen;

	public Claim(int claimId, int customerId, boolean closed, int monthsOpen) {
		this.claimId = claimId;
		this.customerId = customerId;
		this.closed = closed;
		this.monthsOpen = monthsOpen;
	}

	public int getClaimId() {
		return claimId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public boolean isClosed() {
		return closed;
	}

	public int getMonthsOpen() {
		return monthsOpen;
	}

	public boolean compareFilledFields(String claimId, String customerId, String closed, String monthsOpen) {
		if ((claimId.isBlank() || this.claimId == (Integer.parseInt(claimId)))
				&& (customerId.isBlank() || this.customerId == (Integer.parseInt(customerId)))
				&& (monthsOpen.isBlank() || this.monthsOpen == (Integer.parseInt(monthsOpen)))
				&& (closed.isBlank() || this.closed == (Boolean.parseBoolean(closed)))) {
		} else {
			return false;
		}
		return true;
	}

}
