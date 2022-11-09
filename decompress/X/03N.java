// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.Resources;
import android.content.ComponentName;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.os.Parcelable;
import android.os.Bundle;
import android.app.PendingIntent;
import android.content.Intent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import android.view.View$OnClickListener;

public final class 03N implements View$OnClickListener
{
    public final /* synthetic */ 13L LIZ;
    
    static {
        Covode.recordClassIndex(435);
    }
    
    public 03N(final 13L liz) {
        this.LIZ = liz;
    }
    
    public final void onClick(final View view) {
        if (view == this.LIZ.LIZJ) {
            this.LIZ.LJI();
            return;
        }
        if (view == this.LIZ.LJ) {
            this.LIZ.LJFF();
            return;
        }
        if (view == this.LIZ.LIZLLL) {
            this.LIZ.LJ();
            return;
        }
        Label_0440: {
            if (view != this.LIZ.LJII) {
                break Label_0440;
            }
            final 13L liz = this.LIZ;
            if (liz.LJIJ == null) {
                return;
            }
            final SearchableInfo ljij = liz.LJIJ;
            try {
                final boolean voiceSearchLaunchWebSearch = ljij.getVoiceSearchLaunchWebSearch();
                final String s = null;
                String flattenToShortString = null;
                if (voiceSearchLaunchWebSearch) {
                    final Intent intent = new Intent(liz.LJIIIZ);
                    final ComponentName searchActivity = ljij.getSearchActivity();
                    if (searchActivity != null) {
                        flattenToShortString = searchActivity.flattenToShortString();
                    }
                    intent.putExtra("calling_package", flattenToShortString);
                    13L.LIZ(liz.getContext(), intent);
                    return;
                }
                if (ljij.getVoiceSearchLaunchRecognizer()) {
                    final Intent ljiij = liz.LJIIJ;
                    final ComponentName searchActivity2 = ljij.getSearchActivity();
                    final Intent intent2 = new Intent("android.intent.action.SEARCH");
                    intent2.setComponent(searchActivity2);
                    final PendingIntent activity = PendingIntent.getActivity(liz.getContext(), 0, intent2, 1073741824);
                    final Bundle bundle = new Bundle();
                    if (liz.LJIJI != null) {
                        bundle.putParcelable("app_data", (Parcelable)liz.LJIJI);
                    }
                    final Intent intent3 = new Intent(ljiij);
                    String string = "free_form";
                    int voiceMaxResults = 1;
                    final Resources resources = liz.getResources();
                    if (ljij.getVoiceLanguageModeId() != 0) {
                        string = resources.getString(ljij.getVoiceLanguageModeId());
                    }
                    String string2;
                    if (ljij.getVoicePromptTextId() != 0) {
                        string2 = resources.getString(ljij.getVoicePromptTextId());
                    }
                    else {
                        string2 = null;
                    }
                    String string3;
                    if (ljij.getVoiceLanguageId() != 0) {
                        string3 = resources.getString(ljij.getVoiceLanguageId());
                    }
                    else {
                        string3 = null;
                    }
                    if (ljij.getVoiceMaxResults() != 0) {
                        voiceMaxResults = ljij.getVoiceMaxResults();
                    }
                    intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
                    intent3.putExtra("android.speech.extra.PROMPT", string2);
                    intent3.putExtra("android.speech.extra.LANGUAGE", string3);
                    intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
                    String flattenToShortString2;
                    if (searchActivity2 == null) {
                        flattenToShortString2 = s;
                    }
                    else {
                        flattenToShortString2 = searchActivity2.flattenToShortString();
                    }
                    intent3.putExtra("calling_package", flattenToShortString2);
                    intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", (Parcelable)activity);
                    intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
                    13L.LIZ(liz.getContext(), intent3);
                }
                return;
                while (true) {
                    this.LIZ.LJIIIIZZ();
                    return;
                    iftrue(Label_0458:)(view != this.LIZ.LIZ);
                    continue;
                }
                Label_0458:;
            }
            catch (final ActivityNotFoundException ex) {}
        }
    }
}
