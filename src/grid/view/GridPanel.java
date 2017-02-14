package grid.view;

import javax.swing.JPanel;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import grid.controller.GridController;

public class GridPanel extends JPanel 
{
	private GridController gridController;
	private SpringLayout baseLayout;
	private JTextArea gridDisplay;
	private JButton gridButton;
	
	
	public GridPanel(GridController baseController)
	{
		super();
		this.gridController = gridController;
		baseLayout = new SpringLayout();
		gridDisplay = new JTextArea(25, 25);
		gridButton = new JButton("");
		
		setupGridDisplay();
		setupPanel();
		setupLayout();
		setupListeners();	
	}
	
	private void setupGridDisplay()
	{
		
	}
	
	private void setupPanel()
	{
		
	}

	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
