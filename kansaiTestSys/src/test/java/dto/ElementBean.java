package dto;

public class ElementBean {
	private String idAtr;
	private String nameAtr;
	private String classNameAtr;
	private String xpathAtr;

	public ElementBean(String _id, String _name, String _className, String _xpath) {
		this.idAtr = _id;
		this.nameAtr = _name;
		this.classNameAtr = _className;
		this.xpathAtr = _xpath;
	}

	public String getIdAtr() {
		return idAtr;
	}

	public void setIdAtr(String idAtr) {
		this.idAtr = idAtr;
	}

	public String getNameAtr() {
		return nameAtr;
	}

	public void setNameAtr(String nameAtr) {
		this.nameAtr = nameAtr;
	}

	public String getClassNameAtr() {
		return classNameAtr;
	}

	public void setClassNameAtr(String classNameAtr) {
		this.classNameAtr = classNameAtr;
	}

	public String getXpathAtr() {
		return xpathAtr;
	}

	public void setXpathAtr(String xpathAtr) {
		this.xpathAtr = xpathAtr;
	}
}
