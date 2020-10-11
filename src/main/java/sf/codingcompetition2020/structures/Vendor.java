package sf.codingcompetition2020.structures;

public class Vendor {
	private int vendorId;
	private String area;
	private int vendorRating;
	private boolean inScope;

	public Vendor(int vendorId, String area, int vendorRating, boolean inScope) {
		this.vendorId = vendorId;
		this.area = area;
		this.vendorRating = vendorRating;
		this.inScope = inScope;
	}

	public int getVendorId() {
		return vendorId;
	}

	public String getArea() {
		return area;
	}

	public int getVendorRating() {
		return vendorRating;
	}

	public boolean isInScope() {
		return inScope;
	}

	public boolean compareFilledFields(String vendorId, String area, String vendorRating, String inScope) {

		if (	(vendorId.isBlank() || this.vendorId == (Integer.parseInt(vendorId)))
				&& (vendorRating.isBlank() || this.vendorRating == (Integer.parseInt(vendorRating)))
				&& (area.isBlank() || this.area.equals(area))
				&& (inScope.isBlank() || this.inScope == (Boolean.parseBoolean(inScope)))) {
		} else {
			return false;
		}

		return true;

	}
}
