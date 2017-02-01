package grid.view;

import grid.controller.*;
import javax.swing.JFrame;
import java.awt.Dimension;

public class GridFrame extends JFrame 
{
private GridController baseController;
private GridPanel appPanel;

public GridFrame(GridController baseController)
{
	super();
	this.baseController = baseController;
	this.appPanel = new GridPanel(baseController);
	
	this.setupFrame();
}

public void setupFrame()
{
	this.setContentPane(appPanel);
	this.setTitle(" ");
	this.setSize(new Dimension(700, 700));
	this.setVisible(true);
}
}
