public class ExampleActivity extends GirafActivity implements GirafConfirmDialog.Confirmation { //* \label{line:confirm_dialog:interface}

    // Identifier for callback
    private static final int CONFIRM_DIALOG_ID = 1; 
    
    // Fragment tag (android specific)
    private static final String CONFIRM_DIALOG_TAG = "DIALOG_TAG"; 

    ...

    /**
     * When some button is clicked in the gui
     * @param view the view that was clicked
     */
    public void onActionButtonClick(View view) {
        // Creates an instance of the dialog
        GirafConfirmDialog confirmDialog = GirafConfirmDialog.newInstance("A good title", "This describes the dialog", CONFIRM_DIALOG_ID); //* \label{line:confirm_dialog:newinstance}
        
        // Shows the dialog
        confirmDialog.show(getSupportFragmentManager(), CONFIRM_DIALOG_TAG); //* \label{line:confirm_dialog:show}
    }

    @Override
    public void confirmDialog(int dialogIdentifier) { //* \label{line:confirm_dialog:confirmdialogstart}
        if (dialogIdentifier == CONFIRM_DIALOG_ID) {
            // Perform some action after the confirmation
        }
    } //* \label{line:confirm_dialog:confirmdialogend}
}