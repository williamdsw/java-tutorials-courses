package jdbc;

/**
 * @author William
 */

// JDBC
public class TableDefinitionsDemo {
    public static void main(String[] args) {
        try {
            // Data
            final long DELAY = 250;
            TableDefinitions tableOperations = new TableDefinitions();
            boolean wasTableCreated = tableOperations.createClubTable();
            Thread.sleep(DELAY);

            boolean wasColumnAdded = tableOperations.addTopScorerColumn();
            Thread.sleep(DELAY);

            boolean wasColumnDropped = tableOperations.dropTopScorerColumn();
            Thread.sleep(DELAY);

            boolean wesTableDropped = tableOperations.dropClubTable();
            Thread.sleep(DELAY);

            boolean wasPlayerTableCreated = tableOperations.createPlayerTable();
            Thread.sleep(DELAY);

            // Output
            System.out.printf("CLUB table %s created! \n", wasTableCreated ? "was" : "was not");
            System.out.printf("TOP_SCORER column %s added! \n", wasColumnAdded ? "was" : "was not");
            System.out.printf("TOP_SCORER column %s dropped! \n", wasColumnDropped ? "was" : "was not");
            System.out.printf("CLUB table %s dropped! \n", wesTableDropped ? "was" : "was not");
            System.out.printf("PLAYER table %s created! \n", wasPlayerTableCreated ? "was" : "was not");
        } catch (InterruptedException exception) {
            System.out.println(exception);
        }
    }
}