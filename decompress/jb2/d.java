// 
// Decompiled by Procyon v0.6.0
// 

package jb2;

import i10.a;
import android.graphics.Color;
import android.content.Context;
import ng2.e;
import android.text.TextUtils;
import android.app.Activity;
import android.net.Uri;
import com.reddit.domain.model.Link;

public final class d implements a$c
{
    public String a;
    public Integer b;
    
    public d() {
        this.a = null;
    }
    
    public d(final Link link) {
        Uri.parse(link.getUrl());
        String primaryKeyColor;
        if (link.getSubredditDetail() != null) {
            primaryKeyColor = link.getSubredditDetail().getPrimaryKeyColor();
        }
        else {
            primaryKeyColor = null;
        }
        this.a = primaryKeyColor;
    }
    
    public d(final Integer b) {
        this.b = b;
    }
    
    public final void a(final Activity activity, final Uri uri) {
        final Integer b = this.b;
        int n;
        if (b != null) {
            n = b;
        }
        else {
            final String a = this.a;
            if (TextUtils.isEmpty((CharSequence)a)) {
                e.c((Object)activity);
                n = cg.d.y2(2130969570, (Context)activity);
            }
            else {
                n = Color.parseColor(a);
            }
        }
        i10.a.a0((Context)activity).i().P1(activity, uri.toString(), Integer.valueOf(n));
    }
}
