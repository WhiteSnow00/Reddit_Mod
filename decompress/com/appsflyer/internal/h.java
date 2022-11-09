// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import java.util.Iterator;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.AbstractList;
import java.math.BigDecimal;
import java.util.List;
import com.bytedance.covode.number.Covode;

public final class h
{
    static {
        Covode.recordClassIndex(2694);
    }
    
    public static List<BigDecimal> AFInAppEventType(Object value) {
        final AbstractList list = (AbstractList)value;
        final Object value2 = list.get(0);
        value = list.get(1);
        final Object value3 = list.get(2);
        final ArrayList list2 = new ArrayList();
        list2.add(BigDecimal.valueOf(Double.parseDouble(value2.toString())));
        list2.add(BigDecimal.valueOf(Double.parseDouble(value.toString())));
        list2.add(BigDecimal.valueOf(Double.parseDouble(value3.toString())));
        return list2;
    }
    
    public final Map AFInAppEventParameterName(final List<Map<String, Object>> list) {
        final HashMap hashMap = new HashMap();
        final Iterator<Map<String, Object>> iterator = list.iterator();
        HashMap hashMap2;
        while (true) {
            hashMap2 = hashMap;
            if (!iterator.hasNext()) {
                break;
            }
            final Map map = iterator.next();
            final HashMap hashMap3 = new HashMap();
            int n;
            if (map.get("sVS") != null) {
                n = 1;
            }
            else {
                n = 0;
            }
            int n2;
            if (map.get("sVE") != null) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            c c;
            if (n != 0) {
                if (n2 != 0) {
                    c = h.c.values;
                }
                else {
                    c = h.c.AFInAppEventParameterName;
                }
            }
            else {
                c = h.c.AFInAppEventType;
            }
            if (c == h.c.AFInAppEventType) {
                hashMap2 = new HashMap();
                hashMap2.put("er", "na");
                break;
            }
            final Number n3 = (Number)map.get("sT");
            final Object value = map.get("sN");
            if (value != null) {
                hashMap3.put("n", value);
            }
            else {
                hashMap3.put("n", "uk");
            }
            final b b = h.b.values()[n3.intValue()];
            final ArrayList list2 = new ArrayList(AFInAppEventType(map.get("sVS")));
            if (c == h.c.values) {
                list2.addAll((Collection)AFInAppEventType(map.get("sVE")));
            }
            ArrayList list5;
            if (b == h.b.AFInAppEventType) {
                final ArrayList list3 = new ArrayList();
                final BigDecimal value2 = BigDecimal.valueOf(Math.atan2(((Number)list2.get(1)).doubleValue(), ((Number)list2.get(0)).doubleValue()) * 57.29577951308232);
                final DecimalFormat decimalFormat = new DecimalFormat("##.#");
                decimalFormat.setRoundingMode(RoundingMode.DOWN);
                list3.add(Double.parseDouble(decimalFormat.format(value2)));
                final Object value3 = list2.get(2);
                final DecimalFormat decimalFormat2 = new DecimalFormat("##.#");
                decimalFormat2.setRoundingMode(RoundingMode.DOWN);
                list3.add(Double.parseDouble(decimalFormat2.format(value3)));
                final ArrayList list4 = new ArrayList();
                if (list2.size() > 5) {
                    final BigDecimal subtract = BigDecimal.valueOf(Math.atan2(((Number)list2.get(4)).doubleValue(), ((Number)list2.get(3)).doubleValue()) * 57.29577951308232).subtract(value2);
                    final DecimalFormat decimalFormat3 = new DecimalFormat("##.#");
                    decimalFormat3.setRoundingMode(RoundingMode.DOWN);
                    list4.add(Double.parseDouble(decimalFormat3.format(subtract)));
                    final BigDecimal subtract2 = ((BigDecimal)list2.get(5)).subtract((BigDecimal)list2.get(2));
                    final DecimalFormat decimalFormat4 = new DecimalFormat("##.#");
                    decimalFormat4.setRoundingMode(RoundingMode.DOWN);
                    list4.add(Double.parseDouble(decimalFormat4.format(subtract2)));
                }
                list5 = new ArrayList();
                list5.add(list3);
                list5.add(list4);
            }
            else {
                final ArrayList list6 = new ArrayList();
                if (list2.size() > 5) {
                    final BigDecimal subtract3 = ((BigDecimal)list2.get(3)).subtract((BigDecimal)list2.get(0));
                    final DecimalFormat decimalFormat5 = new DecimalFormat("##.#");
                    decimalFormat5.setRoundingMode(RoundingMode.DOWN);
                    list6.add(Double.parseDouble(decimalFormat5.format(subtract3)));
                    final BigDecimal subtract4 = ((BigDecimal)list2.get(4)).subtract((BigDecimal)list2.get(1));
                    final DecimalFormat decimalFormat6 = new DecimalFormat("##.#");
                    decimalFormat6.setRoundingMode(RoundingMode.DOWN);
                    list6.add(Double.parseDouble(decimalFormat6.format(subtract4)));
                    final BigDecimal subtract5 = ((BigDecimal)list2.get(5)).subtract((BigDecimal)list2.get(2));
                    final DecimalFormat decimalFormat7 = new DecimalFormat("##.#");
                    decimalFormat7.setRoundingMode(RoundingMode.DOWN);
                    list6.add(Double.parseDouble(decimalFormat7.format(subtract5)));
                }
                final ArrayList list7 = new ArrayList();
                final Object value4 = list2.get(0);
                final DecimalFormat decimalFormat8 = new DecimalFormat("##.#");
                decimalFormat8.setRoundingMode(RoundingMode.DOWN);
                list7.add(Double.parseDouble(decimalFormat8.format(value4)));
                final Object value5 = list2.get(1);
                final DecimalFormat decimalFormat9 = new DecimalFormat("##.#");
                decimalFormat9.setRoundingMode(RoundingMode.DOWN);
                list7.add(Double.parseDouble(decimalFormat9.format(value5)));
                final Object value6 = list2.get(2);
                final DecimalFormat decimalFormat10 = new DecimalFormat("##.#");
                decimalFormat10.setRoundingMode(RoundingMode.DOWN);
                list7.add(Double.parseDouble(decimalFormat10.format(value6)));
                list5 = new ArrayList();
                list5.add(list7);
                list5.add(list6);
            }
            hashMap3.put("v", list5);
            hashMap.put(e.values()[n3.intValue()].valueOf, hashMap3);
            if (c != h.c.AFInAppEventParameterName) {
                continue;
            }
            hashMap.put("er", "no_svs");
        }
        return hashMap2;
    }
    
    public enum b
    {
        AFInAppEventParameterName, 
        AFInAppEventType, 
        AFKeystoreWrapper, 
        valueOf, 
        values;
        
        static {
            Covode.recordClassIndex(2695);
        }
    }
    
    public enum c
    {
        AFInAppEventParameterName, 
        AFInAppEventType, 
        values;
        
        static {
            Covode.recordClassIndex(2696);
        }
    }
    
    public enum e
    {
        AFInAppEventParameterName("uk"), 
        AFInAppEventType("am"), 
        AFKeystoreWrapper("mm"), 
        AFVersionDeclaration("gs"), 
        values("rs");
        
        public String valueOf;
        
        static {
            Covode.recordClassIndex(2697);
        }
        
        public e(final String valueOf) {
            this.valueOf = valueOf;
        }
    }
}
