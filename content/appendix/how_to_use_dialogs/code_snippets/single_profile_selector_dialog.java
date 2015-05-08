public class ExampleActivity extends GirafActivity implements GirafProfileSelectorDialog.OnSingleProfileSelectedListener {

    // Identifier for callback
    private static final int PROFILE_SELECT_DIALOG_ID = 1; 
    
    // Fragment tag (android specific)
    private static final String PROFILE_SELECT_DIALOG_TAG = "DIALOG_TAG"; 

    ...

    /**
     * When some button is clicked in the gui
     * @param view the view that was clicked
     */
    public void onActionButtonClick(View view) {
        // Creates an instance of the dialog
        GirafProfileSelectorDialog singleSelectDialog = GirafProfileSelectorDialog.newInstance(this,getGuardianIdentifier(),false,false,"Select a profile for some purpose", PROFILE_SELECT_DIALOG_ID);

        // Shows the dialog
        singleSelectDialog.show(getSupportFragmentManager(), PROFILE_SELECT_DIALOG_TAG);
    }

    @Override
    public void onProfileSelected(int dialogIdentifier, Profile profile) {
        if(dialogIdentifier == PROFILE_SELECT_DIALOG_ID) {
            // Perform some action based on the profile selected
        }
    }

    private long getGuardianIdentifier() {
        // Some code that returns the wanted guardian identifier
    }
}