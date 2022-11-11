// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.Filter$FilterResults;
import android.database.Cursor;
import com.bytedance.covode.number.Covode;
import android.widget.Filter;

public final class 08y extends Filter
{
    public a LIZ;
    
    static {
        Covode.recordClassIndex(939);
    }
    
    public 08y(final a liz) {
        this.LIZ = liz;
    }
    
    public final CharSequence convertResultToString(final Object o) {
        return this.LIZ.LIZIZ((Cursor)o);
    }
    
    public final Filter$FilterResults performFiltering(final CharSequence charSequence) {
        final Cursor liz = this.LIZ.LIZ(charSequence);
        final Filter$FilterResults filter$FilterResults = new Filter$FilterResults();
        if (liz != null) {
            filter$FilterResults.count = liz.getCount();
            filter$FilterResults.values = liz;
        }
        else {
            filter$FilterResults.count = 0;
            filter$FilterResults.values = null;
        }
        return filter$FilterResults;
    }
    
    public final void publishResults(final CharSequence charSequence, final Filter$FilterResults filter$FilterResults) {
        final Cursor liz = this.LIZ.LIZ();
        if (filter$FilterResults.values != null && filter$FilterResults.values != liz) {
            this.LIZ.LIZ((Cursor)filter$FilterResults.values);
        }
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(940);
        }
        
        Cursor LIZ();
        
        Cursor LIZ(final CharSequence p0);
        
        void LIZ(final Cursor p0);
        
        CharSequence LIZIZ(final Cursor p0);
    }
}
