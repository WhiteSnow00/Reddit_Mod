// 
// Decompiled by Procyon v0.6.0
// 

package c50;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import java.util.LinkedHashMap;
import a4.u1;
import qg2.m;
import java.util.List;
import javax.inject.Inject;
import ah2.f;
import com.reddit.domain.model.AbbreviatedComment;
import java.util.HashMap;
import q20.b;

public final class s0 implements e0
{
    public final b a;
    public final HashMap<String, AbbreviatedComment> b;
    public final String c;
    
    @Inject
    public s0(final b a) {
        f.f((Object)a, "resourceProvider");
        this.a = a;
        this.b = new HashMap<String, AbbreviatedComment>();
        this.c = a.getString(2131953066);
    }
    
    @Override
    public final void a(final String s) {
        f.f((Object)s, "commentKindWithId");
        final AbbreviatedComment abbreviatedComment = this.b.get(s);
        if (abbreviatedComment != null) {
            this.b.put(s, AbbreviatedComment.copy$default(abbreviatedComment, (String)null, this.c, (String)null, this.a.getString(2131953067), (String)null, (String)null, (String)null, false, false, 497, (Object)null));
        }
    }
    
    @Override
    public final void b(final List<AbbreviatedComment> list) {
        f.f((Object)list, "comments");
        final HashMap<String, AbbreviatedComment> b = this.b;
        int a0;
        if ((a0 = u1.A0(m.P0((Iterable)list, 10))) < 16) {
            a0 = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(a0);
        for (final AbbreviatedComment abbreviatedComment : list) {
            final Pair pair = new Pair((Object)abbreviatedComment.getKindWithId(), (Object)abbreviatedComment);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        b.putAll((Map<? extends String, ? extends AbbreviatedComment>)linkedHashMap);
    }
    
    @Override
    public final void c(final AbbreviatedComment abbreviatedComment) {
        f.f((Object)abbreviatedComment, "comment");
        this.b.put(abbreviatedComment.getKindWithId(), abbreviatedComment);
    }
    
    @Override
    public final Boolean d(String author) {
        f.f((Object)author, "commentKindWithId");
        final AbbreviatedComment abbreviatedComment = this.b.get(author);
        if (abbreviatedComment != null) {
            author = abbreviatedComment.getAuthor();
            if (author != null) {
                return author.equals(this.c);
            }
        }
        return null;
    }
    
    @Override
    public final LinkedHashMap e(final ArrayList list) {
        final HashMap<String, AbbreviatedComment> b = this.b;
        final ArrayList list2 = new ArrayList();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            final AbbreviatedComment abbreviatedComment = b.get(iterator.next());
            if (abbreviatedComment != null) {
                list2.add(abbreviatedComment);
            }
        }
        int a0;
        if ((a0 = u1.A0(m.P0((Iterable)list2, 10))) < 16) {
            a0 = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(a0);
        for (final AbbreviatedComment abbreviatedComment2 : list2) {
            final Pair pair = new Pair((Object)abbreviatedComment2.getKindWithId(), (Object)abbreviatedComment2);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
    
    @Override
    public final AbbreviatedComment f(final String s) {
        f.f((Object)s, "commentKindWithId");
        return this.b.get(s);
    }
    
    @Override
    public final void g(final AbbreviatedComment abbreviatedComment) {
        f.f((Object)abbreviatedComment, "comment");
        if (this.b.containsKey(abbreviatedComment.getKindWithId())) {
            this.b.put(abbreviatedComment.getKindWithId(), abbreviatedComment);
        }
    }
}
