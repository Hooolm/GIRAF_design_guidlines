public class ExampleActivity extends GirafActivity implements GirafInflatableDialog.OnCustomViewCreatedListener { //* \label{line:inflatable_dialog:interface}

    // Identifier for callback
    private static final Integer CLOCK_DIALOG_ID = 1;

    // Fragment tag (android specific)
    private static final String CLOCK_DIALOG_TAG = "DIALOG_TAG";

    ...

    /**
     * When some button is clicked in the gui
     * @param view the view that was clicked
     */
    public void onActionButtonClick(View view) {
        // Creates an instance of the dialog
        GirafInflatableDialog clockDialog = GirafInflatableDialog.newInstance("Time", "Here is the time on an analog clock", R.layout.example_layout, CLOCK_DIALOG_ID); //* \label{line:inflatable_dialog:layoutres}

        // Show the dialog
        clockDialog.show(getSupportFragmentManager(),CLOCK_DIALOG_TAG);
    }

    @Override
    public void editCustomView(ViewGroup customView, int dialogIdentifier) { //* \label{line:inflatable_dialog:accesscustomviewstart}
        if(dialogIdentifier == CLOCK_DIALOG_ID) {
            
            // Find the close button defined in xml
            GirafButton closeButton = (GirafButton) customView.findViewById(R.id.close_button);

            // Do something with the close button eg. set an oClickListener

        }
    } //* \label{line:inflatable_dialog:accesscustomviewend}
}