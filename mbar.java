import java.awt.*; 
import java.awt.event.*; 
/* <APPLET CODE ="mbar.class" WIDTH=300 HEIGHT=200> </APPLET> */ 
public class mbar extends Frame 
  { 
          MenuBar mb=new MenuBar(); 
          Label label=new Label(" "); 
          public static void main(String args[]) 
             { 
              //demomenu1 app=new demomenu1(); 
             }  
                public void demomenu1() 
                 {
                     Panel panel=new Panel(); 
                    panel.add(label); 
                    add("Center",panel); 
                    addWindowListener(new WindowEventHandler()); 
                    menudetails(); 
                    setMenuBar(mb); 
                    pack(); 
                    setSize(400,400); 
                    show(); 
                 } 
                  void menudetails() 
                        {  
                            Menu fmenu=new Menu("File"); 
                            Menu emenu=new Menu("Edit"); 
                            Menu hmenu=new Menu("Help"); 
                            MenuItem newfitem=new MenuItem("New");
                            MenuItem exitfitem=new MenuItem("Exit"); 
                            fmenu.add(newfitem); 
                            fmenu.addSeparator(); 
                            fmenu.add(exitfitem); 
                            MenuItem cuteitem=new MenuItem("Cut"); 
                            MenuItem copyitem=new MenuItem("Copy");
                            MenuItem pasteitem=new MenuItem("Paste"); 
                            CheckboxMenuItem refreshitem=new CheckboxMenuItem("Refresh",true);
                            emenu.add(cuteitem); 
                            emenu.add(copyitem); 
                            emenu.add(pasteitem); 
                            emenu.addSeparator(); 
                            emenu.add(refreshitem); 
                            Menu sendmenu=new Menu("Send To"); 
                            MenuItem drivesitem=new MenuItem("Send to Drive"); 
                            MenuItem deskitem=new MenuItem("send to Desktop"); 
                            sendmenu.add(drivesitem); 
                            sendmenu.add(deskitem); 
                            emenu.add(sendmenu); 
                            MenuItem abouthitem=new MenuItem("About"); 
                            hmenu.add(abouthitem); 
                            mb.add(fmenu); 
                            mb.add(emenu); 
                            mb.add(hmenu); 
                            Menuhandler mh=new Menuhandler(); 
                            newfitem.addActionListener(mh);
                            exitfitem.addActionListener(mh); 
                            cuteitem.addActionListener(mh); 
                            copyitem.addActionListener(mh); 
                            pasteitem.addActionListener(mh);
                            refreshitem.addActionListener(mh);
                           drivesitem.addActionListener(mh);
                           deskitem.addActionListener(mh); 
                           abouthitem.addActionListener(mh);
                       }  
    	 class Menuhandler implements ActionListener,ItemListener 
      	 { 
             public void actionPerformed(ActionEvent e) 
             { 
                   String s=e.getActionCommand(); 
                   label.setText(s); 
                   validate(); 
                   if(s.equals("Exit")) System.exit(0); 
            } 
        public void itemStateChanged(ItemEvent e) 
         { 
                 CheckboxMenuItem   
         	  item=(CheckboxMenuItem)e.getItemSelectable();
                  String status; 
                  if(item.getState())status="You checked:"; 
                  else status="you unchecked"; 
                   status+=item.getLabel(); 
                   label.setText(status); 
                    validate(); 
                     }  
         } 
      class WindowEventHandler extends WindowAdapter 
       { 
            public void windowClosing(WindowEvent e) 
                   { 
                              System.exit(0); 
                   } 
       } }
