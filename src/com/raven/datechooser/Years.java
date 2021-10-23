package com.raven.datechooser;

import javax.swing.JButton;

public final class Years extends javax.swing.JPanel {

    private Event event;
    private int startYear;

    public Years() {
        initComponents();
    }

    public int showYear(int year) {
        year = calculateYear(year);
        for (int i = 0; i < getComponentCount(); i++) {
            JButton cmd = (JButton) getComponent(i);
            cmd.setText(year + "");
            year++;
        }
        return startYear;
    }

    private int calculateYear(int year) {
        year -= year % 10;
        startYear = year;
        return year;
    }

    private void addEvent() {
        for (int i = 0; i < getComponentCount(); i++) {
            ((Button) getComponent(i)).setEvent(event);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmd1 = new com.raven.datechooser.Button();
        cmd2 = new com.raven.datechooser.Button();
        cmd3 = new com.raven.datechooser.Button();
        cmd4 = new com.raven.datechooser.Button();
        cmd5 = new com.raven.datechooser.Button();
        cmd6 = new com.raven.datechooser.Button();
        cmd7 = new com.raven.datechooser.Button();
        cmd8 = new com.raven.datechooser.Button();
        cmd9 = new com.raven.datechooser.Button();
        cmd10 = new com.raven.datechooser.Button();
        cmd11 = new com.raven.datechooser.Button();
        cmd12 = new com.raven.datechooser.Button();
        cmd13 = new com.raven.datechooser.Button();
        cmd14 = new com.raven.datechooser.Button();
        cmd15 = new com.raven.datechooser.Button();
        cmd16 = new com.raven.datechooser.Button();
        cmd17 = new com.raven.datechooser.Button();
        cmd18 = new com.raven.datechooser.Button();
        cmd19 = new com.raven.datechooser.Button();
        cmd20 = new com.raven.datechooser.Button();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridLayout(5, 4));

        cmd1.setBackground(new java.awt.Color(255, 255, 255));
        cmd1.setForeground(new java.awt.Color(75, 75, 75));
        cmd1.setText("2010");
        cmd1.setName("year"); // NOI18N
        cmd1.setOpaque(true);
        add(cmd1);

        cmd2.setBackground(new java.awt.Color(255, 255, 255));
        cmd2.setForeground(new java.awt.Color(75, 75, 75));
        cmd2.setText("2011");
        cmd2.setName("year"); // NOI18N
        cmd2.setOpaque(true);
        add(cmd2);

        cmd3.setBackground(new java.awt.Color(255, 255, 255));
        cmd3.setForeground(new java.awt.Color(75, 75, 75));
        cmd3.setText("2012");
        cmd3.setName("year"); // NOI18N
        cmd3.setOpaque(true);
        add(cmd3);

        cmd4.setBackground(new java.awt.Color(255, 255, 255));
        cmd4.setForeground(new java.awt.Color(75, 75, 75));
        cmd4.setText("2013");
        cmd4.setName("year"); // NOI18N
        cmd4.setOpaque(true);
        add(cmd4);

        cmd5.setBackground(new java.awt.Color(255, 255, 255));
        cmd5.setForeground(new java.awt.Color(75, 75, 75));
        cmd5.setText("2014");
        cmd5.setName("year"); // NOI18N
        cmd5.setOpaque(true);
        add(cmd5);

        cmd6.setBackground(new java.awt.Color(255, 255, 255));
        cmd6.setForeground(new java.awt.Color(75, 75, 75));
        cmd6.setText("2015");
        cmd6.setName("year"); // NOI18N
        cmd6.setOpaque(true);
        add(cmd6);

        cmd7.setBackground(new java.awt.Color(255, 255, 255));
        cmd7.setForeground(new java.awt.Color(75, 75, 75));
        cmd7.setText("2016");
        cmd7.setName("year"); // NOI18N
        cmd7.setOpaque(true);
        add(cmd7);

        cmd8.setBackground(new java.awt.Color(255, 255, 255));
        cmd8.setForeground(new java.awt.Color(75, 75, 75));
        cmd8.setText("2017");
        cmd8.setName("year"); // NOI18N
        cmd8.setOpaque(true);
        add(cmd8);

        cmd9.setBackground(new java.awt.Color(255, 255, 255));
        cmd9.setForeground(new java.awt.Color(75, 75, 75));
        cmd9.setText("2018");
        cmd9.setName("year"); // NOI18N
        cmd9.setOpaque(true);
        add(cmd9);

        cmd10.setBackground(new java.awt.Color(255, 255, 255));
        cmd10.setForeground(new java.awt.Color(75, 75, 75));
        cmd10.setText("2019");
        cmd10.setName("year"); // NOI18N
        cmd10.setOpaque(true);
        add(cmd10);

        cmd11.setBackground(new java.awt.Color(255, 255, 255));
        cmd11.setForeground(new java.awt.Color(75, 75, 75));
        cmd11.setText("2020");
        cmd11.setName("year"); // NOI18N
        cmd11.setOpaque(true);
        add(cmd11);

        cmd12.setBackground(new java.awt.Color(255, 255, 255));
        cmd12.setForeground(new java.awt.Color(75, 75, 75));
        cmd12.setText("2021");
        cmd12.setName("year"); // NOI18N
        cmd12.setOpaque(true);
        add(cmd12);

        cmd13.setBackground(new java.awt.Color(255, 255, 255));
        cmd13.setForeground(new java.awt.Color(75, 75, 75));
        cmd13.setText("2022");
        cmd13.setName("year"); // NOI18N
        cmd13.setOpaque(true);
        add(cmd13);

        cmd14.setBackground(new java.awt.Color(255, 255, 255));
        cmd14.setForeground(new java.awt.Color(75, 75, 75));
        cmd14.setText("2023");
        cmd14.setName("year"); // NOI18N
        cmd14.setOpaque(true);
        add(cmd14);

        cmd15.setBackground(new java.awt.Color(255, 255, 255));
        cmd15.setForeground(new java.awt.Color(75, 75, 75));
        cmd15.setText("2024");
        cmd15.setName("year"); // NOI18N
        cmd15.setOpaque(true);
        add(cmd15);

        cmd16.setBackground(new java.awt.Color(255, 255, 255));
        cmd16.setForeground(new java.awt.Color(75, 75, 75));
        cmd16.setText("2025");
        cmd16.setName("year"); // NOI18N
        cmd16.setOpaque(true);
        add(cmd16);

        cmd17.setBackground(new java.awt.Color(255, 255, 255));
        cmd17.setForeground(new java.awt.Color(75, 75, 75));
        cmd17.setText("2026");
        cmd17.setName("year"); // NOI18N
        cmd17.setOpaque(true);
        add(cmd17);

        cmd18.setBackground(new java.awt.Color(255, 255, 255));
        cmd18.setForeground(new java.awt.Color(75, 75, 75));
        cmd18.setText("2027");
        cmd18.setName("year"); // NOI18N
        cmd18.setOpaque(true);
        add(cmd18);

        cmd19.setBackground(new java.awt.Color(255, 255, 255));
        cmd19.setForeground(new java.awt.Color(75, 75, 75));
        cmd19.setText("2028");
        cmd19.setName("year"); // NOI18N
        cmd19.setOpaque(true);
        add(cmd19);

        cmd20.setBackground(new java.awt.Color(255, 255, 255));
        cmd20.setForeground(new java.awt.Color(75, 75, 75));
        cmd20.setText("2029");
        cmd20.setName("year"); // NOI18N
        cmd20.setOpaque(true);
        add(cmd20);
    }// </editor-fold>//GEN-END:initComponents

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
        addEvent();
    }

    public int next(int year) {
        showYear(year + 20);
        return startYear;
    }

    public int back(int year) {
        showYear(year - 20);
        return startYear;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.datechooser.Button cmd1;
    private com.raven.datechooser.Button cmd10;
    private com.raven.datechooser.Button cmd11;
    private com.raven.datechooser.Button cmd12;
    private com.raven.datechooser.Button cmd13;
    private com.raven.datechooser.Button cmd14;
    private com.raven.datechooser.Button cmd15;
    private com.raven.datechooser.Button cmd16;
    private com.raven.datechooser.Button cmd17;
    private com.raven.datechooser.Button cmd18;
    private com.raven.datechooser.Button cmd19;
    private com.raven.datechooser.Button cmd2;
    private com.raven.datechooser.Button cmd20;
    private com.raven.datechooser.Button cmd3;
    private com.raven.datechooser.Button cmd4;
    private com.raven.datechooser.Button cmd5;
    private com.raven.datechooser.Button cmd6;
    private com.raven.datechooser.Button cmd7;
    private com.raven.datechooser.Button cmd8;
    private com.raven.datechooser.Button cmd9;
    // End of variables declaration//GEN-END:variables

}
