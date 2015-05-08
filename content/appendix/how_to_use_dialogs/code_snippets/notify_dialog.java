public class ExampleActivity extends GirafActivity implements GirafNotifyDialog.Notification {

    // Identifier for callback
    private static final int NOTIFY_DIALOG_ID = 1; 
    
    // Fragment tag (android specific)
    private static final String NOTIFY_DIALOG_TAG = "DIALOG_TAG"; 

    ...

    /**
     * When some button is clicked in the gui
     * @param view the view that was clicked
     */
    public void onActionButtonClick(View view) {
        // Creates an instance of the dialog
        GirafNotifyDialog notifyDialog = GirafNotifyDialog.newInstance("A good title", "This describes the dialog", NOTIFY_DIALOG_ID);

        // Shows the dialog
        notifyDialog.show(getSupportFragmentManager(), NOTIFY_DIALOG_TAG);
    }

    @Override
    public void noticeDialog(int dialogIdentifier) {
        if(dialogIdentifier == NOTIFY_DIALOG_ID) {
            // Perform some action after the notification
        }
    }
}