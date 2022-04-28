public abstract class cNodeShell
{
  protected cNode head;
  protected int numberOfCustomers;

  /**  constructor
  *  sets head to null and numberOfCustomers to 0
  */
  public cNodeShell( )
  {
    head = null;
    numberOfCustomers = 0;
  }

  /**  accessor for numberOfCustomers
  *  @return    numberOfCustomers
  */
  public int getNumberOfItems( )
  {
    return numberOfCustomers;
  }

  /**  isEmpty method
  *  @return    true if no items in list; false otherwise
  */
  public boolean isEmpty( )
  {
    return ( numberOfCustomers == 0 );
  }

  /**  toString
  *  @return the contents of the list
  */
  @Override
  public String toString( )
  {
    String listString = "";
    cNode current = head;
    while ( current != null )
	 {
      listString += current.toString( ) + "\n";
      current = current.getNext( );
    }
    return listString;
  }
}
