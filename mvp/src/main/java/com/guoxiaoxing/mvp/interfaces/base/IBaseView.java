package com.guoxiaoxing.mvp.interfaces.base;

/**
 * Author: guoxiaoxing
 * Email: guoxiaoxingv@163.com
 * Site:  https://github.com/guoxiaoxing
 * Date: 16/5/6 下午2:43
 * Function:
 * <p/>
 * Modification history:
 * Date                 Author              Version             Description
 * --------------------------------------------------------------------------
 * 16/5/6 下午2:43     guoxiaoxing          1.0
 */
public interface IBaseView<T> {

    /**
     * 让View持有Presenter对象
     *
     * @param presenter presenter
     */
    void setPresenter(T presenter);
}
