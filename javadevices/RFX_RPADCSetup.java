/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manduchi
 */
public class RFX_RPADCSetup extends DeviceSetup {

    /**
     * Creates new form RFX_RPADCSetup
     */
    public RFX_RPADCSetup() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deviceButtons1 = new DeviceButtons();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        deviceField1 = new DeviceField();
        deviceDispatch1 = new DeviceDispatch();
        jPanel3 = new javax.swing.JPanel();
        deviceField2 = new DeviceField();
        deviceField3 = new DeviceField();
        deviceField4 = new DeviceField();
        jPanel4 = new javax.swing.JPanel();
        deviceChoice1 = new DeviceChoice();
        deviceChoice2 = new DeviceChoice();
        deviceChoice3 = new DeviceChoice();
        jPanel5 = new javax.swing.JPanel();
        deviceField5 = new DeviceField();
        deviceField6 = new DeviceField();
        jPanel6 = new javax.swing.JPanel();
        deviceField7 = new DeviceField();
        deviceField8 = new DeviceField();
        deviceField10 = new DeviceField();

        setDeviceProvider("spilds.rfx.local");
        setDeviceTitle("RedPitaya ADC");
        setDeviceType("RFX_RPADC");
        setHeight(300);
        setWidth(700);
        getContentPane().add(deviceButtons1, java.awt.BorderLayout.PAGE_END);

        jPanel1.setLayout(new java.awt.GridLayout(5, 1));

        deviceField1.setIdentifier("");
        deviceField1.setLabelString("Comment:");
        deviceField1.setNumCols(25);
        deviceField1.setOffsetNid(1);
        deviceField1.setTextOnly(true);
        jPanel2.add(deviceField1);
        jPanel2.add(deviceDispatch1);

        jPanel1.add(jPanel2);

        deviceField2.setIdentifier("");
        deviceField2.setLabelString("Decimation:");
        deviceField2.setOffsetNid(2);
        jPanel3.add(deviceField2);

        deviceField3.setIdentifier("");
        deviceField3.setLabelString("Buffer Size:");
        deviceField3.setOffsetNid(3);
        jPanel3.add(deviceField3);

        deviceField4.setIdentifier("");
        deviceField4.setLabelString("Segment Size: ");
        deviceField4.setOffsetNid(4);
        jPanel3.add(deviceField4);

        jPanel1.add(jPanel3);

        deviceChoice1.setChoiceItems(new String[] {"STREAMING", "EVENT_STREAMING"});
        deviceChoice1.setIdentifier("");
        deviceChoice1.setLabelString("Mode:");
        deviceChoice1.setOffsetNid(7);
        deviceChoice1.setUpdateIdentifier("");
        jPanel4.add(deviceChoice1);

        deviceChoice2.setChoiceItems(new String[] {"UPPER", "LOWER"});
        deviceChoice2.setIdentifier("");
        deviceChoice2.setLabelString("Event Mode: ");
        deviceChoice2.setOffsetNid(8);
        deviceChoice2.setUpdateIdentifier("");
        jPanel4.add(deviceChoice2);

        deviceChoice3.setChoiceItems(new String[] {"A", "B"});
        deviceChoice3.setIdentifier("");
        deviceChoice3.setLabelString("Event Chan.:");
        deviceChoice3.setOffsetNid(9);
        deviceChoice3.setUpdateIdentifier("");
        jPanel4.add(deviceChoice3);

        jPanel1.add(jPanel4);

        deviceField5.setIdentifier("");
        deviceField5.setLabelString("Trigger: ");
        deviceField5.setNumCols(30);
        deviceField5.setOffsetNid(5);
        jPanel5.add(deviceField5);

        deviceField6.setIdentifier("");
        deviceField6.setLabelString("Event Samples: ");
        deviceField6.setNumCols(4);
        deviceField6.setOffsetNid(11);
        jPanel5.add(deviceField6);

        jPanel1.add(jPanel5);

        deviceField7.setIdentifier("");
        deviceField7.setLabelString("Pre Samples: ");
        deviceField7.setOffsetNid(12);
        jPanel6.add(deviceField7);

        deviceField8.setIdentifier("");
        deviceField8.setLabelString("Post Samples: ");
        deviceField8.setOffsetNid(13);
        jPanel6.add(deviceField8);

        deviceField10.setIdentifier("");
        deviceField10.setLabelString("Event Level:");
        deviceField10.setOffsetNid(10);
        jPanel6.add(deviceField10);

        jPanel1.add(jPanel6);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private DeviceButtons deviceButtons1;
    private DeviceChoice deviceChoice1;
    private DeviceChoice deviceChoice2;
    private DeviceChoice deviceChoice3;
    private DeviceDispatch deviceDispatch1;
    private DeviceField deviceField1;
    private DeviceField deviceField10;
    private DeviceField deviceField2;
    private DeviceField deviceField3;
    private DeviceField deviceField4;
    private DeviceField deviceField5;
    private DeviceField deviceField6;
    private DeviceField deviceField7;
    private DeviceField deviceField8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}