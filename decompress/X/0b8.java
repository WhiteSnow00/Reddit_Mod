// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.google.gson.d;
import com.bytedance.android.livesdk.model.utils.adapter.BooleanTypeAdapter;
import com.bytedance.android.livesdk.model.utils.adapter.FeedItemTypeAdapter;
import com.bytedance.android.livesdk.model.FeedItem;
import java.lang.reflect.Type;
import com.bytedance.android.livesdk.model.utils.adapter.RoomTypeAdapter;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.google.gson.c;
import com.google.gson.Gson;
import com.google.gson.e;
import com.bytedance.covode.number.Covode;

public final class 0b8
{
    static {
        Covode.recordClassIndex(5604);
    }
    
    public static final class a
    {
        public static final e LIZ;
        public static final Gson LIZIZ;
        public static final Gson LIZJ;
        
        static {
            Covode.recordClassIndex(5605);
            final e liz = new e();
            liz.LIZIZ = (d)c.LOWER_CASE_WITH_UNDERSCORES;
            liz.LIZ((Type)Room.class, (Object)new RoomTypeAdapter());
            liz.LIZ((Type)FeedItem.class, (Object)new FeedItemTypeAdapter());
            liz.LIZ((Type)Boolean.class, (Object)new BooleanTypeAdapter());
            liz.LIZ((Type)Boolean.TYPE, (Object)new BooleanTypeAdapter());
            LIZ = liz;
            LIZIZ = liz.LIZIZ();
            LIZJ = new Gson();
        }
    }
}
