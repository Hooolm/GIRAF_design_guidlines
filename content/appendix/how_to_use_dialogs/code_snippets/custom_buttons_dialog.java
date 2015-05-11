public class ExampleActivity extends GirafActivity implements GirafCustomButtonsDialog.CustomButtons { //* \label{line:custom_buttons_dialog:interface}

    // Identifier for callback
    private static final Integer CUSTOM_BUTTONS_DIALOG_ID = 1;

    // Fragment tag (android specific)
    private static final String CUSTOM_BUTTONS_DIALOG_TAG = "DIALOG_TAG";

    ...

    /**
     * When some button is clicked in the gui
     * @param view the view that was clicked
     */
    public void onActionButtonClick(View view) {
        // Creates an instance of the dialog
        GirafCustomButtonsDialog customButtonsDialog = GirafCustomButtonsDialog.newInstance("Pick an action","Choose what should happen to the element", CUSTOM_BUTTONS_DIALOG_ID);

        // Show the dialog
        customButtonsDialog.show(getSupportFragmentManager(),CUSTOM_BUTTONS_DIALOG_TAG);
    }

    @Override
    public void fillButtonContainer(int dialogIdentifier, GirafCustomButtonsDialog.ButtonContainer buttonContainer) { //* \label{line:custom_buttons_dialog:fillbuttonstart}
        if(dialogIdentifier == CUSTOMBUTTONS_DIALOG_ID) {
            GirafButton renameButton = new GirafButton(this,"Rename");
            GirafButton copyButton = new GirafButton(this,"Copy");
            GirafButton deleteButton = new GirafButton(this,"Delete");

            // Set onClickListeners to the buttons

            buttonContainer.addGirafButton(renameButton);
            buttonContainer.addGirafButton(copyButton);
            buttonContainer.addGirafButton(deleteButton);
        }
    } //* \label{line:custom_buttons_dialog:fillbuttonend}
}