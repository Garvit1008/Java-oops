public class stringhashcode
{  
    public static void main(String args[]){  
        System.out.println("Hashcode test of String:");  
        String str="java";  
        System.out.println(str.hashCode());  
        str=str+"tpoint";  
        System.out.println(str.hashCode());  
   
        System.out.println("Hashcode test of StringBuffer:");  
        StringBuffer sb=new StringBuffer("java");  
        System.out.println(sb.hashCode());  
        sb.append("tpoint");  
        System.out.println(sb.hashCode());
        StringBuilder a = new StringBuilder("terepa venom");
        System.out.println(a.hashCode());
        a.append("randi");  
        System.out.println(a.hashCode());
    }  
}  
