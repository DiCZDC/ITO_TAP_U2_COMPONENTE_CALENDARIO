/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package calcFechas;

import java.awt.Color;
import java.awt.Font;
import java.time.*;
import static java.time.temporal.ChronoUnit.*;

/**
 *
 * @author raulc
 */
public class panelTiempoFechas extends javax.swing.JPanel {
    
    private Color colorCboMes1 = new Color(187,187,187);
    private Color colorCboAnio1= new Color(187,187,187);
    private Color colorBtnDia1 = new Color(187,187,187);
    
    private Color colorFontCboMes1 = new Color(187,187,187);
    private Color colorFontCboAnio1= new Color(187,187,187);
    private Color colorFontBtnDia1 = new Color(187,187,187);
    
    private Font FontCboMes1 = new Font("Segoe UI", Font.PLAIN,12);
    private Font FontCboAnio1= new Font("Segoe UI", Font.PLAIN,12);
    private Font FontBtnDia1 = new Font("Segoe UI", Font.PLAIN,12);
    
    private Color colorCboMes2 = new Color(187,187,187);
    private Color colorCboAnio2= new Color(187,187,187);
    private Color colorBtnDia2 = new Color(187,187,187);
    
    private Color colorFontCboMes2 = new Color(187,187,187);
    private Color colorFontCboAnio2= new Color(187,187,187);
    private Color colorFontBtnDia2 = new Color(187,187,187);
    
    private Font FontCboMes2 = new Font("Segoe UI", Font.PLAIN,12);
    private Font FontCboAnio2= new Font("Segoe UI", Font.PLAIN,12);
    private Font FontBtnDia2 = new Font("Segoe UI", Font.PLAIN,12);
    
    public panelTiempoFechas() {
        initComponents();
    }
    
    
    public long diasEntre(){
        LocalDate fecha1 = panelCalendario1.getFechacomp().toInstant()
      .atZone(ZoneId.systemDefault())
      .toLocalDate();
        LocalDate fecha2 = panelCalendario2.getFechacomp().toInstant()
      .atZone(ZoneId.systemDefault())
      .toLocalDate();
       return DAYS.between(fecha1,fecha2);
    }
    
    public long mesesEntre(){
        LocalDate fecha1 = panelCalendario1.getFechacomp().toInstant()
      .atZone(ZoneId.systemDefault())
      .toLocalDate();
        LocalDate fecha2 = panelCalendario2.getFechacomp().toInstant()
      .atZone(ZoneId.systemDefault())
      .toLocalDate();
       return MONTHS.between(fecha1,fecha2);
    }
    
    public long aniosEntre(){
        LocalDate fecha1 = panelCalendario1.getFechacomp().toInstant()
      .atZone(ZoneId.systemDefault())
      .toLocalDate();
        LocalDate fecha2 = panelCalendario2.getFechacomp().toInstant()
      .atZone(ZoneId.systemDefault())
      .toLocalDate();
       return YEARS.between(fecha1,fecha2);
    }
    
     // <editor-fold defaultstate="collapsed" desc="desplegar para ver los sets y gets">

    public Color getColorCboMes1() {
        return colorCboMes1;
    }

    public void setColorCboMes1(Color colorCboMes1) {
        this.colorCboMes1 = colorCboMes1;
        panelCalendario1.setColorCboMes(colorCboMes1);
    }

    public Color getColorCboAnio1() {
        return colorCboAnio1;
    }

    public void setColorCboAnio1(Color colorCboAnio1) {
        this.colorCboAnio1 = colorCboAnio1;
        panelCalendario1.setColorCboAnio(colorCboAnio1);
    }

    public Color getColorBtnDia1() {
        return colorBtnDia1;
    }

    public void setColorBtnDia1(Color colorBtnDia1) {
        this.colorBtnDia1 = colorBtnDia1;
        panelCalendario1.setColorBtnDia(colorBtnDia1);
    }

    public Color getColorFontCboMes1() {
        return colorFontCboMes1;
    }

    public void setColorFontCboMes1(Color colorFontCboMes1) {
        this.colorFontCboMes1 = colorFontCboMes1;
        panelCalendario1.setColorFontCboMes(colorFontCboMes1);
    }

    public Color getColorFontCboAnio1() {
        return colorFontCboAnio1;
    }

    public void setColorFontCboAnio1(Color colorFontCboAnio1) {
        this.colorFontCboAnio1 = colorFontCboAnio1;
        panelCalendario1.setColorFontCboAnio(colorFontCboAnio1);
    }

    public Color getColorFontBtnDia1() {
        return colorFontBtnDia1;
    }

    public void setColorFontBtnDia1(Color colorFontBtnDia1) {
        this.colorFontBtnDia1 = colorFontBtnDia1;
        panelCalendario1.setColorFontBtnDia(colorFontBtnDia1);
    }

    public Font getFontCboMes1() {
        return FontCboMes1;
    }

    public void setFontCboMes1(Font FontCboMes1) {
        this.FontCboMes1 = FontCboMes1;
        panelCalendario1.setFontCboMes(FontCboMes1);
    }

    public Font getFontCboAnio1() {
        return FontCboAnio1;
    }

    public void setFontCboAnio1(Font FontCboAnio1) {
        this.FontCboAnio1 = FontCboAnio1;
        panelCalendario1.setFontCboAnio(FontCboAnio1);
    }

    public Font getFontBtnDia1() {
        return FontBtnDia1;
    }

    public void setFontBtnDia1(Font FontBtnDia1) {
        this.FontBtnDia1 = FontBtnDia1;
        panelCalendario1.setFontBtnDia(FontBtnDia1);
    }

    public Color getColorCboMes2() {
        return colorCboMes2;
    }

    public void setColorCboMes2(Color colorCboMes2) {
        this.colorCboMes2 = colorCboMes2;
        panelCalendario2.setColorCboMes(colorCboMes2);
    }

    public Color getColorCboAnio2() {
        return colorCboAnio2;
    }

    public void setColorCboAnio2(Color colorCboAnio2) {
        this.colorCboAnio2 = colorCboAnio2;
        panelCalendario2.setColorCboAnio(colorCboAnio2);
    }

    public Color getColorBtnDia2() {
        return colorBtnDia2;
    }

    public void setColorBtnDia2(Color colorBtnDia2) {
        this.colorBtnDia2 = colorBtnDia2;
        panelCalendario2.setColorBtnDia(colorBtnDia2);
    }

    public Color getColorFontCboMes2() {
        return colorFontCboMes2;
    }

    public void setColorFontCboMes2(Color colorFontCboMes2) {
        this.colorFontCboMes2 = colorFontCboMes2;
        panelCalendario2.setColorFontCboMes(colorFontCboMes2);
    }

    public Color getColorFontCboAnio2() {
        return colorFontCboAnio2;
    }

    public void setColorFontCboAnio2(Color colorFontCboAnio2) {
        this.colorFontCboAnio2 = colorFontCboAnio2;
        panelCalendario2.setColorFontCboAnio(colorFontCboAnio2);
    }

    public Color getColorFontBtnDia2() {
        return colorFontBtnDia2;
    }

    public void setColorFontBtnDia2(Color colorFontBtnDia2) {
        this.colorFontBtnDia2 = colorFontBtnDia2;
        panelCalendario2.setColorFontBtnDia(colorFontBtnDia2);
    }

    public Font getFontCboMes2() {
        return FontCboMes2;
    }

    public void setFontCboMes2(Font FontCboMes2) {
        this.FontCboMes2 = FontCboMes2;
        panelCalendario2.setFontCboMes(FontCboMes2);
    }

    public Font getFontCboAnio2() {
        return FontCboAnio2;
    }

    public void setFontCboAnio2(Font FontCboAnio2) {
        this.FontCboAnio2 = FontCboAnio2;
        panelCalendario2.setFontCboAnio(FontCboAnio2);
    }

    public Font getFontBtnDia2() {
        return FontBtnDia2;
    }

    public void setFontBtnDia2(Font FontBtnDia2) {
        this.FontBtnDia2 = FontBtnDia2;
        panelCalendario2.setFontBtnDia(FontBtnDia2);
    }
    
    
    
    // </editor-fold>  
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelCalendario1 = new calcFechas.panelCalendario();
        jPanel2 = new javax.swing.JPanel();
        panelCalendario2 = new calcFechas.panelCalendario();

        setLayout(new java.awt.GridLayout(2, 0, 0, 50));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));
        jPanel1.add(panelCalendario1);

        add(jPanel1);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));
        jPanel2.add(panelCalendario2);

        add(jPanel2);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private calcFechas.panelCalendario panelCalendario1;
    private calcFechas.panelCalendario panelCalendario2;
    // End of variables declaration//GEN-END:variables
}
