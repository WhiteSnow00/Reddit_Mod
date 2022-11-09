// 
// Decompiled by Procyon v0.6.0
// 

package c50;

import com.raizlabs.android.dbflow.rx2.language.RXModelQueriable;
import com.raizlabs.android.dbflow.sql.language.BaseQueriable;
import com.raizlabs.android.dbflow.sql.language.BaseTransformable;
import gn.a;
import pg2.j;
import com.raizlabs.android.dbflow.sql.language.Where;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import com.raizlabs.android.dbflow.sql.language.From;
import com.raizlabs.android.dbflow.sql.language.Select;
import qw.d;
import sf2.o;
import com.raizlabs.android.dbflow.sql.queriable.ModelQueriable;
import com.raizlabs.android.dbflow.kotlinextensions.OperatorExtensionsKt;
import com.raizlabs.android.dbflow.kotlinextensions.QueryExtensionsKt;
import ah2.i;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import java.util.List;
import nf2.n;
import com.reddit.data.model.VideoUpload_Table;
import com.raizlabs.android.dbflow.sql.language.SQLOperator;
import com.raizlabs.android.dbflow.sql.language.SQLite;
import com.reddit.data.model.VideoUpload;
import ah2.f;
import javax.inject.Inject;

public final class x implements p0
{
    @Inject
    public x() {
    }
    
    @Override
    public final void b(final String s) {
        f.f((Object)s, "requestId");
        ((BaseQueriable)((BaseTransformable)SQLite.delete((Class)VideoUpload.class)).where(new SQLOperator[] { (SQLOperator)VideoUpload_Table.requestId.eq((Object)s) })).execute();
    }
    
    @Override
    public final n<List<com.reddit.domain.model.VideoUpload>> c() {
        final Select select = SQLite.select(new IProperty[0]);
        f.b((Object)select, "SQLite.select()");
        final From from = QueryExtensionsKt.from(select, i.a((Class)VideoUpload.class));
        final Property<String> title = VideoUpload_Table.title;
        final Operator notNull = title.isNotNull();
        f.e((Object)notNull, "title.isNotNull");
        final Operator notEq = title.notEq((Object)"");
        f.e((Object)notEq, "title.notEq(\"\")");
        final Where where = ((BaseTransformable)from).where(new SQLOperator[] { (SQLOperator)OperatorExtensionsKt.and(notNull, (SQLOperator)notEq) });
        final Property<String> subreddit = VideoUpload_Table.subreddit;
        final Operator notNull2 = subreddit.isNotNull();
        f.e((Object)notNull2, "subreddit.isNotNull");
        final Operator notEq2 = subreddit.notEq((Object)"");
        f.e((Object)notEq2, "subreddit.notEq(\"\")");
        final Where and = where.and((SQLOperator)OperatorExtensionsKt.and(notNull2, (SQLOperator)notEq2));
        final Property<String> filePath = VideoUpload_Table.filePath;
        final Operator notNull3 = filePath.isNotNull();
        f.e((Object)notNull3, "filePath.isNotNull");
        final Operator notEq3 = filePath.notEq((Object)"");
        f.e((Object)notEq3, "filePath.notEq(\"\")");
        final Where orderBy = and.and((SQLOperator)OperatorExtensionsKt.and(notNull3, (SQLOperator)notEq3)).orderBy(VideoUpload_Table.timestamp.desc());
        f.e((Object)orderBy, "select.from(VideoUploadD\u2026d_Table.timestamp.desc())");
        final n r = ((RXModelQueriable)com.raizlabs.android.dbflow.rx2.kotlinextensions.QueryExtensionsKt.rx((ModelQueriable)orderBy)).queryList().r((o)new y(0));
        f.e((Object)r, "queryList().flatMapMaybe\u2026t) else Maybe.empty()\n  }");
        final n p = r.p((o)new d(6));
        f.e((Object)p, "select.from(VideoUploadD\u2026toDomainModel() }\n      }");
        return (n<List<com.reddit.domain.model.VideoUpload>>)p;
    }
    
    @Override
    public final j d(final com.reddit.domain.model.VideoUpload videoUpload) {
        if (videoUpload.getId() > 0L) {
            final Select select = SQLite.select(new IProperty[0]);
            f.b((Object)select, "SQLite.select()");
            final VideoUpload videoUpload2 = (VideoUpload)((BaseTransformable)QueryExtensionsKt.from(select, i.a((Class)VideoUpload.class))).where(new SQLOperator[] { (SQLOperator)VideoUpload_Table.id.eq((Object)new Integer((int)videoUpload.getId())) }).querySingle();
            if (videoUpload2 != null) {
                a.b0(videoUpload2, videoUpload);
                videoUpload2.update();
            }
            else {
                final VideoUpload videoUpload3 = new VideoUpload();
                videoUpload3.setId((int)videoUpload.getId());
                a.b0(videoUpload3, videoUpload);
                videoUpload3.save();
            }
        }
        else {
            final String requestId = videoUpload.getRequestId();
            final Select select2 = SQLite.select(new IProperty[0]);
            f.b((Object)select2, "SQLite.select()");
            final VideoUpload videoUpload4 = (VideoUpload)((BaseTransformable)select2.from((Class)VideoUpload.class)).where(new SQLOperator[] { (SQLOperator)VideoUpload_Table.requestId.eq((Object)requestId) }).querySingle();
            if (videoUpload4 != null) {
                a.b0(videoUpload4, videoUpload);
                videoUpload4.update();
            }
            else {
                final VideoUpload videoUpload5 = new VideoUpload();
                a.b0(videoUpload5, videoUpload);
                videoUpload5.insert();
            }
        }
        return j.a;
    }
}
