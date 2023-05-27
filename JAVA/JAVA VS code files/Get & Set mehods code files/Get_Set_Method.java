class Book{
    private int pgNo;

    void setPgNo(int n){
        pgNo=n;
    }
    int getPgNo(){
        return pgNo;
    }
    
    
}
public class Get_Set_Method {
    
    public static void main(String[] args) {
       Book data=new Book();
       data.setPgNo(100);
       data.setPgNo(102);

       System.out.println(data.getPgNo());
    }
}
