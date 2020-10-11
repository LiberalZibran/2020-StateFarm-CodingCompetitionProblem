package sf.codingcompetition2020.application;

//import sf.codingcompetition2020.*;///////////////////////////////////////
import sf.codingcompetition2020.structures.Agent;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class app {

    private JPanel panel_main;
    private JPanel panel_top;
    private JLabel label_title;
    private JPanel panel_agent;
    private JComboBox combo_searchFor;
    private JLabel label_searchFor;
    private JLabel label_fieldsListTitle;
    private JPanel panel2;
    private JPanel panel3;
    private JLabel panel2label;
    private JLabel panel3label;
    private JTextField textf_agentIdAgent;
    private JLabel label_agentIdAgent;
    private JLabel label_area;
    private JTextField textf_area;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Data Display");
        frame.setContentPane(new app().panel_main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        // Sets dimensions, makes visible
        frame.setSize(1280, 720);
        frame.setVisible(true);
    }

    public String searchSelection;

    public app() {

        // Populate ComboBox
        combo_searchFor.addItem((Object)(""));
        combo_searchFor.addItem((Object)("agents"));
        combo_searchFor.addItem((Object)("claims"));
        combo_searchFor.addItem((Object)("customers"));
        combo_searchFor.addItem((Object)("vendors"));

        // Creates searchOptions listener
        ItemListener searchOptionsListener = itemEvent -> {
            int state = itemEvent.getStateChange();
            if (state == ItemEvent.SELECTED) {
                searchSelection = itemEvent.getItem().toString();
                System.out.println(searchSelection);
                //changeOperation(searchSelection);//////////////////////////////////////////////////
            }
        };
        combo_searchFor.addItemListener(searchOptionsListener);

        // Search button listener
            // if clicked,
                // get file path from codingcompscvutiltest
                // say what type of class we are looking for
                // readCsvFile(class, path)
                // iterate through "class"
                    // Agent
                // set output label equal to the toStrings of all classes gotten, all appended into one big string

        Agent zQue = new Agent(6, "1", "2", "3", "4");

        System.out.println(zQue.compareFilledFields("6","1","2","3","4"));


    }


}
