package airesearch;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*@author Hatem Mohamed*/
public class SellerGui extends JFrame{
    JFrame mainFrame=new JFrame();
    JPanel root=new JPanel();
    Label booknamelbl;
    Label bookpricelbl;
    TextField bookname;
    TextField bookprice;
    TextArea area;
    Button save;
    String LocalName;
    String GlobalName;
    public SellerGui(String localname,String globalname) throws HeadlessException {
        this.GlobalName=globalname;
        this.LocalName=localname;
        this.booknamelbl=new Label("Book Name");
        this.bookpricelbl=new Label("Book Price");
        this.bookname=new TextField();
        this.bookprice=new TextField();
        this.area=new TextArea();
        this.area.setText("Book Store\n");
        this.save=new Button("save");
        this.save.setBackground(Color.GRAY);
        this.save.setForeground(Color.WHITE);
        this.mainFrame.setLayout(new GridLayout(0, 1));
        this.root.setLayout(new GridLayout(3,2));
        this.save.addActionListener((e) -> {
            if(!this.bookname.getText().isEmpty() && !this.bookprice.getText().isEmpty()){
                try{
                     Float price=Float.parseFloat(this.bookprice.getText());
                     this.area.setText(this.area.getText()+" \n"+this.bookname.getText()+" => "+price);
                      Book book=new Book(this.GlobalName,this.bookname.getText(),price);
                      BookStore.store.add(book); 
                }catch(Exception exception){
                     JOptionPane.showMessageDialog(null,"Please Enter Numberic value for book price");
                }
            }else{
                JOptionPane.showMessageDialog(null,"Please Enter Book name and book price");
            }  
        });
         this.mainFrame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        this.root.add(this.booknamelbl);
        this.root.add(this.bookname);
        this.root.add(this.bookpricelbl);
        this.root.add(this.bookprice);
        this.root.add(this.save);
        this.root.add(this.area);
        this.show(this.LocalName);
    }
    public void show(String Title){
        mainFrame.setTitle(Title);
        mainFrame.setSize(500,150);
        mainFrame.add(this.root);
        mainFrame.setVisible(true);
    }  
}
