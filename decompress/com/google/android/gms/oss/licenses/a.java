// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.oss.licenses;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.platform.p1;
import android.view.LayoutInflater;
import android.widget.AdapterView$OnItemClickListener;
import se.l;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.view.ViewGroup;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources;
import androidx.appcompat.app.f;
import we.g;
import we.c;

public final class a implements c<String>
{
    public final OssLicensesMenuActivity f;
    
    public a(final OssLicensesMenuActivity f) {
        this.f = f;
    }
    
    public final void k(final g<String> g) {
        String packageName = ((Context)this.f).getPackageName();
        if (!((Activity)this.f).isDestroyed()) {
            if (!((Activity)this.f).isFinishing()) {
                if (g.n()) {
                    packageName = (String)g.j();
                }
                final OssLicensesMenuActivity f = this.f;
                f.i = se.c.a((f)f, packageName);
                final OssLicensesMenuActivity f2 = this.f;
                final se.c k = f2.k;
                final LayoutInflater layoutInflater = ((Activity)f2).getLayoutInflater();
                final p1 i = this.f.i;
                final Resources resources = (Resources)i.g;
                ((f)f2).setContentView(layoutInflater.inflate((XmlPullParser)resources.getXml(resources.getIdentifier("libraries_social_licenses_license_menu_activity", "layout", (String)i.h)), (ViewGroup)null, false));
                final OssLicensesMenuActivity f3 = this.f;
                final se.c j = f3.k;
                final p1 l = f3.i;
                f3.f = (ListView)((f)f3).findViewById(((Resources)l.g).getIdentifier("license_list", "id", (String)l.h));
                final OssLicensesMenuActivity f4 = this.f;
                final OssLicensesMenuActivity f5 = this.f;
                f4.g = (ArrayAdapter)new OssLicensesMenuActivity$a(f5, f5);
                final OssLicensesMenuActivity f6 = this.f;
                f6.f.setAdapter((ListAdapter)f6.g);
                ((AdapterView)this.f.f).setOnItemClickListener((AdapterView$OnItemClickListener)new l(this));
            }
        }
    }
}
