# NYT
 
Currently the baseline app for Week 5 INFS3634.

You will need to know how everything in this app works to be able to continue in Week 6.

**Week 5**
- Fragments (new class ArticleRecyclerFragment, ProfileFragment).
  - And associated layout files for the fragments, fragment_article_recycler.xml and fragment_profile.xml
- Moved RecyclerView set up code from MainActivity to ArticleRecyclerFragment.
- Added BottomNavigationView, making it replace the Fragment depending on item selected.
  - Requires another layout file for the menu (see res > menu > bottom_nav_menu.xml)
- Added ProfileFragment (just exists to be another Fragment to swap to)

**Week 4**
- New class "ArticleAdapter" - our custom Adapter for the RecyclerView
- Refactor MainActivity.java to use RecyclerView
- Change activity_main.xml to be only a RecyclerView
- Same functionality as last week, but so much cleaner, efficient, and scalable.
- (NEW) Showing images (temporary way), check changes in Article, FakeDatabase, ArticleAdapter

**Week 3**
- Second activity, the detail activity that shows the user the details for a specific article.
- Explicit intent from the main activity to the detail activity, carrying over the article ID as an extra.
- Implicit intent on the share button on the main activity, to share the article.
- Using "FakeDatabase" to get Article objects to use as our data.

**Week 2**
- Main activity shows two articles in a ConstraintLayout, in a ScrollView.
- The article layout is defined in a separate file ```article.xml```
- We use ```<include>``` to reuse the article layout in our main activity
