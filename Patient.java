class Patient{
	
/*//5 rules 
1)public class
2)default constructor
3)private variable/data-member/states/fields
4)public getter and setter
5)oops*/
	
		

private int patientId;
private patientName;
private int age;
private String bloodGroup;
private String gender;
private String address;
private long contactNo;
private int wardNo;
private String attenderName;
private String diseaseName;
private String consultant;
private String hospitalName;
private double fees;

//getter and setter
public void setPatientId(int patientId){
this.patientId =patientId ;
}

public void  getPatientId(){
	return PatientId;
}


public void setPatientName(String patientName){
this.patientName;
}

public void  getPatientName(){
	return PatientName;
}

public void setAge(int age){
this.age=age;
}

public void  getAge(){
	return age;
}

public void setBloodGroup(String bloodGroup){
this.bloodgroup=bloodgroup;
}

public void  getBloodGroup(){
	return bloodgroup;
}

public void setGender(String Gender){
this.gender=gender;
}

public void  getGender(){
	return gender;
}

public void setAddress(String address){
this.address=address;
}

public void  getAddress(){
	return address;
}

public void setContactNo(Long contactNo){
this.contactNo=contactNo;
}

public void  getContactNo(){
	return contactNo;
}

public void setWardNo(int wardNo){
this.wardNo=wardNo;
}

public void  getWardNo(){
	return wardNo;
}

public void setAttenderName(String AttenderName){
this.attenderName=attenderName;
}

public void  getAttenderName(){
	return attenderName;
}

public void setDiseaseName(String diseaseName){
this.diseaseName=diseaseName;
}

public void getDiseaseName(){
return diseaseName;
}

public void setConsultant(String consultant){
this.consultant=consultant;
}

public void getConsultant(){
return consultant;
}

public void setHospitalName(String hospitalName){
this.hospitalName=hospitalName;
}

public void getHospitalName(){
return hospitalName;
}

public void setFees(double fees){
this.fees=fees;
}

public void getFees(){
return fees;
}
}









}