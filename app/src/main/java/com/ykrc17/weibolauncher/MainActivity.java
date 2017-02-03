package com.ykrc17.weibolauncher;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void createShortcut(View button) {
        Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
        intent.putExtra(Intent.EXTRA_SHORTCUT_INTENT, createIntent());
        intent.putExtra(Intent.EXTRA_SHORTCUT_NAME, "微勃");
        intent.putExtra(Intent.EXTRA_SHORTCUT_ICON_RESOURCE, Intent.ShortcutIconResource.fromContext(this, R.mipmap.logo));
        sendBroadcast(intent);
    }

    private static Intent createIntent() {
        Intent intent = new Intent();
        ComponentName cn = new ComponentName("com.sina.weibo", "com.sina.weibo.MainTabActivity");
        intent.setComponent(cn);
        return intent;
    }
}
