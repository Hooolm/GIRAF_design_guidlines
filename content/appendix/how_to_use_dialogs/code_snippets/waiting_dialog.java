public class ExampleActivity extends GirafActivity {

    private static final String WAITING_DIALOG_TAG = "DIALOG_TAG"; // Fragment tag (android specific)
    private GirafWaitingDialog waitingDialog;

    /**
     * An async task that performs a task that takes time
     */
    private class ExampleTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() { 
            super.onPreExecute();

            // Shows the dialog
            waitingDialog.show(getSupportFragmentManager(), WAITING_DIALOG_TAG); //* \label{line:waiting_dialog:showdialog}
        } 

        @Override
        protected Void doInBackground(Void... params) {
            // Perform the task the user needs to wait for
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

            // Hides the dialog
            waitingDialog.dismiss(); //* \label{line:waiting_dialog:dismissdialog}
        }
    }

    ...

    @Override
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState);

        // Initialize the waiting dialog
        waitingDialog = GirafWaitingDialog.newInstance("Please wait", "We are currently performing a task that takes time"); //* \label{line:waiting_dialog:oncreate}
    }

    /**
     * When some button is clicked in the gui
     * @param view the view that was clicked
     */
    public void onActionButtonClick(View view) {

        // Starts a tasks
        new ExampleTask().execute(); //* \label{line:waiting_dialog:executetask}
    }

}