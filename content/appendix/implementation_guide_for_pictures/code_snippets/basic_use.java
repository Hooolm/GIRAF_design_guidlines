@Override
public View getView(int position, View convertView, ViewGroup parent) {
    // Find the pictogram to show
    final Pictogram pictogram = pictogramList.get(position);

    // Generate a view that will be used to display the pictogram
    GirafPictogramItemView itemView = new GirafPictogramItemView(context, pictogram);

    // ...

    return itemView;
}