package admin;

public class Buffer {
	 
    public static void main(String[] args) {
 
        String contentStr = "Chennai1" + "," + "Bangalore";
        System.out.println("Using String:" + contentStr);
 
        StringBuffer content = new StringBuffer();
        content.append("Chennai2").append(",").append("Bangalore");
        System.out.println("Using StringBuffer:" + content);
         
        StringBuilder content2 = new StringBuilder();
        content2.append("Chennai3");
        content2.append(",");
        content2.append("Bangalore");
        System.out.println("Using StringBuilder:"+ content2);
 
    }
 
}
