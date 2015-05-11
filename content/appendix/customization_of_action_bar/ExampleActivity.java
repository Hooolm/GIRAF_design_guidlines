public class ExampleActivity extends GirafActivity {
    
    ...
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the title of the actionbar
        setActionBarTitle("Custom Title"); //* \label{line:actionbar:title}

        // Instantiate buttons for the action bar
        GirafButton cameraButton = new GirafButton(this,getResources().getDrawable(R.drawable.icon_camera)); //* \label{line:actionbar:buttonstart}
        GirafButton helpButton = new GirafButton(this,getResources().getDrawable(R.drawable.icon_help));

        // Add the buttons to the action bar
        addGirafButtonToActionBar(cameraButton,LEFT);
        addGirafButtonToActionBar(helpButton,RIGHT); //* \label{line:actionbar:buttonend}
        
        ...
        
    }
}