@Override
public View getView(int position, View convertView, ViewGroup parent) {
    // Find the pictogram to show
    final Pictogram pictogram = pictogramList.get(position);

    // Find the drawable that will be used as a fallback
    Drawable fallback = context.getResources().getDrawable(R.drawable.icon_fallback);

    // Generate a view that will be used to display the pictogram
    GirafPictogramItemView itemView = new GirafPictogramItemView(context, pictogram, fallback);

    // ...

    return itemView;
}