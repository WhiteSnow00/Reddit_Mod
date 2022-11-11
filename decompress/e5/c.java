// 
// Decompiled by Procyon v0.6.0
// 

package e5;

import com.reddit.screens.header.SubredditHeaderView;
import android.util.Log;
import bb0.h;
import android.graphics.Bitmap;
import android.os.AsyncTask;

public final class c extends AsyncTask<Bitmap, Void, b>
{
    public final /* synthetic */ b.d a;
    public final /* synthetic */ b.b b;
    
    public c(final b.b b, final h a) {
        this.b = b;
        this.a = (b.d)a;
    }
    
    public final Object doInBackground(final Object[] array) {
        final Bitmap[] array2 = (Bitmap[])array;
        b a;
        try {
            a = this.b.a();
        }
        catch (final Exception ex) {
            Log.e("Palette", "Exception thrown during async generate", (Throwable)ex);
            a = null;
        }
        return a;
    }
    
    public final void onPostExecute(final Object o) {
        final b b = (b)o;
        final h h = (h)this.a;
        SubredditHeaderView.m((SubredditHeaderView)h.g, h.f, b);
    }
}
