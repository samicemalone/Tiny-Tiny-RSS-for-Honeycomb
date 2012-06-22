package org.fox.ttrss.offline;

import org.fox.ttrss.OnlineServices;
import org.fox.ttrss.OnlineServices.RelativeArticle;

import android.database.sqlite.SQLiteDatabase;

public interface OfflineServices {
	public int getActiveFeedId();
	public SQLiteDatabase getReadableDb();
	public SQLiteDatabase getWritableDb();
	public int getRelativeArticleId(int baseId, int feedId, OnlineServices.RelativeArticle mode);
	public void viewFeed(int feedId);
	public void onCatSelected(int catId);
	public void openArticle(int articleId, int compatAnimation);
	public boolean getUnreadOnly();
	public int getSelectedArticleId();
	public void initMainMenu();
	public boolean isSmallScreen();
	public void setSelectedArticleId(int articleId);
}
