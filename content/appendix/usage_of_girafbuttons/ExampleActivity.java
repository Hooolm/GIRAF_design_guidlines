public class ExampleActivity extends GirafActivity {

    ...

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Sets the layout of the activity
        setContentView(R.layout.example_activity);

        // Get a button from xml
        GirafButton xmlButton = (GirafButton) findViewById(R.id.giraf_button);

        // Program buttons directly in code
        GirafButton iconButton = new GirafButton(this, getResources().getDrawable(R.drawable.icon_camera));
        GirafButton textButton = new GirafButton(this, "Camera");
        GirafButton iconTextButton = new GirafButton(this, getResources().getDrawable(R.drawable.icon_camera), "Camera");

    }
}