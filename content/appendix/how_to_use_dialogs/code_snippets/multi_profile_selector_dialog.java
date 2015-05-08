public class ExampleActivity extends GirafActivity implements GirafProfileSelectorDialog.OnMultipleProfilesSelectedListener {

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
        GirafProfileSelectorDialog multiSelectDialog = GirafProfileSelectorDialog.newInstance(this,getGuardianIdentifier(),false,true,"Select some profiles for some purpose", PROFILE_SELECT_DIALOG_ID);

        // Shows the dialog
        multiSelectDialog.show(getSupportFragmentManager(), PROFILE_SELECT_DIALOG_TAG);
    }

    @Override
    public void onProfilesSelected(int dialogIdentifier, List<Pair<Profile, Boolean>> checkedProfileList) {
        if(dialogIdentifier == PROFILE_SELECT_DIALOG_ID) {
            // Perform some action based on the list of profiles and check status
        }

    }

    private long getGuardianIdentifier() {
        // Some code that returns the wanted guardian identifier
    }

}