package com.xiaomiwujiecao.servicebestpractice;

/**
 * Created by genius on 2017/4/5.
 */

public interface DownloadListener {
    void onProgress(int progress);

    void onSuccess();

    void onFaild();

    void onPause();

    void onCanceled();
}
