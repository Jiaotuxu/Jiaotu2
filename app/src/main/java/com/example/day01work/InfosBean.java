package com.example.day01work;

import java.util.List;

/**
 * Created by 光头魔王 on 2019/10/22.
 */

public class InfosBean {

    /**
     * code : 0000
     * message : 首页数据
     * ggBean : [{"ggIma_url":"http://106.13.63.54:8080/sys/image/o.jpg","gg_title":"这是第一张图","ggWeb_url":"http://106.13.63.54:8080/sys/xxx.html"},{"ggIma_url":"http://106.13.63.54:8080/sys/image/p.jpg","gg_title":"这是第二张图","ggWeb_url":"http://106.13.63.54:8080/sys/xxx.html"},{"ggIma_url":"http://106.13.63.54:8080/sys/image/q.jpg","gg_title":"这是第三张图","ggWeb_url":"http://106.13.63.54:8080/sys/xxx.html"},{"ggIma_url":"http://106.13.63.54:8080/sys/image/r.jpg","gg_title":"这是第四张图","ggWeb_url":"http://106.13.63.54:8080/sys/xxx.html"},{"ggIma_url":"http://106.13.63.54:8080/sys/image/s.jpg","gg_title":"这是第五张图","ggWeb_url":"http://106.13.63.54:8080/sys/xxx.html"},{"ggIma_url":"http://106.13.63.54:8080/sys/image/t.jpg","gg_title":"这是第六张图","ggWeb_url":"http://106.13.63.54:8080/sys/xxx.html"},{"ggIma_url":"http://106.13.63.54:8080/sys/image/u.jpg","gg_title":"这是第七张图","ggWeb_url":"http://106.13.63.54:8080/sys/xxx.html"},{"ggIma_url":"http://106.13.63.54:8080/sys/image/v.jpg","gg_title":"这是第八张图","ggWeb_url":"http://106.13.63.54:8080/sys/xxx.html"}]
     * hxListBeans : [{"shop_content":"这是一个电吹风，洗完头发，可以吹干头发，白天用，晚上用，什么适合都可以用，而且还便宜。主要是老少皆宜啊","shop_ListingTime":"1563779867","shop_title":"电吹风","shop_pirce":"3.45","shop_image_url":"http://106.13.63.54:8080/sys/image/l.jpg"},{"shop_content":"文具盒是山谷邪恶时候得必备物品，可以装一些签字，港币，毛笔等一些学习用品，但是不能用来装书，因为装不下","shop_ListingTime":"1563779867","shop_title":"文具盒","shop_pirce":"3.45","shop_image_url":"http://106.13.63.54:8080/sys/image/c.jpg"},{"shop_content":"2B铅笔是用来写字，画画，用得适合，需要大家自己削铅笔，比较麻烦，不过为了安全起见，可以让监护人帮忙啊","shop_ListingTime":"1563779867","shop_title":"铅笔","shop_pirce":"3.45","shop_image_url":"http://106.13.63.54:8080/sys/image/a.jpg"},{"shop_content":"电脑是咱们当今社会不可或缺得一个物品，可以聊天，看视频，打游戏，还可以谢代码，学习，但是不能泡水","shop_ListingTime":"1563779867","shop_title":"电脑","shop_pirce":"3.45","shop_image_url":"http://106.13.63.54:8080/sys/image/b.jpg"},{"shop_content":"键盘这个东西，是给电脑用得，台式机如果没有键盘得话，就没法输入东西，就比较尴尬，没法聊天，没法打游戏，没法学习，最重要得是没法写代码","shop_ListingTime":"1563779867","shop_title":"键盘","shop_pirce":"3.45","shop_image_url":"http://106.13.63.54:8080/sys/image/d.jpg"},{"shop_content":"听歌如果需要效果好一点得话，就需要外接音箱，但是印象有大的，有小的，还有很多颜色的，还有蓝牙的，还有喝多的。这些都是需要花钱买的啊","shop_ListingTime":"1563779867","shop_title":"音响","shop_pirce":"3.45","shop_image_url":"http://106.13.63.54:8080/sys/image/k.jpg"},{"shop_content":"耳机这个是小哥哥小姐姐平时上课时不想听课的最佳不听课物品，因为带上耳机以后就可以听不见老师说话，这样是不好的，所以说实训是不允许带耳机的","shop_ListingTime":"1563779867","shop_title":"耳机","shop_pirce":"3.45","shop_image_url":"http://106.13.63.54:8080/sys/image/e.jpg"}]
     */

    private String code;
    private String message;
    private List<GgBeanBean> ggBean;
    private List<HxListBeansBean> hxListBeans;

    @Override
    public String toString() {
        return "InfosBean{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", ggBean=" + ggBean +
                ", hxListBeans=" + hxListBeans +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<GgBeanBean> getGgBean() {
        return ggBean;
    }

    public void setGgBean(List<GgBeanBean> ggBean) {
        this.ggBean = ggBean;
    }

    public List<HxListBeansBean> getHxListBeans() {
        return hxListBeans;
    }

    public void setHxListBeans(List<HxListBeansBean> hxListBeans) {
        this.hxListBeans = hxListBeans;
    }

    public static class GgBeanBean {
        /**
         * ggIma_url : http://106.13.63.54:8080/sys/image/o.jpg
         * gg_title : 这是第一张图
         * ggWeb_url : http://106.13.63.54:8080/sys/xxx.html
         */

        private String ggIma_url;
        private String gg_title;
        private String ggWeb_url;

        @Override
        public String toString() {
            return "GgBeanBean{" +
                    "ggIma_url='" + ggIma_url + '\'' +
                    ", gg_title='" + gg_title + '\'' +
                    ", ggWeb_url='" + ggWeb_url + '\'' +
                    '}';
        }

        public String getGgIma_url() {
            return ggIma_url;
        }

        public void setGgIma_url(String ggIma_url) {
            this.ggIma_url = ggIma_url;
        }

        public String getGg_title() {
            return gg_title;
        }

        public void setGg_title(String gg_title) {
            this.gg_title = gg_title;
        }

        public String getGgWeb_url() {
            return ggWeb_url;
        }

        public void setGgWeb_url(String ggWeb_url) {
            this.ggWeb_url = ggWeb_url;
        }
    }

    public static class HxListBeansBean {
        /**
         * shop_content : 这是一个电吹风，洗完头发，可以吹干头发，白天用，晚上用，什么适合都可以用，而且还便宜。主要是老少皆宜啊
         * shop_ListingTime : 1563779867
         * shop_title : 电吹风
         * shop_pirce : 3.45
         * shop_image_url : http://106.13.63.54:8080/sys/image/l.jpg
         */

        private String shop_content;
        private String shop_ListingTime;
        private String shop_title;
        private String shop_pirce;
        private String shop_image_url;

        @Override
        public String toString() {
            return "HxListBeansBean{" +
                    "shop_content='" + shop_content + '\'' +
                    ", shop_ListingTime='" + shop_ListingTime + '\'' +
                    ", shop_title='" + shop_title + '\'' +
                    ", shop_pirce='" + shop_pirce + '\'' +
                    ", shop_image_url='" + shop_image_url + '\'' +
                    '}';
        }

        public String getShop_content() {
            return shop_content;
        }

        public void setShop_content(String shop_content) {
            this.shop_content = shop_content;
        }

        public String getShop_ListingTime() {
            return shop_ListingTime;
        }

        public void setShop_ListingTime(String shop_ListingTime) {
            this.shop_ListingTime = shop_ListingTime;
        }

        public String getShop_title() {
            return shop_title;
        }

        public void setShop_title(String shop_title) {
            this.shop_title = shop_title;
        }

        public String getShop_pirce() {
            return shop_pirce;
        }

        public void setShop_pirce(String shop_pirce) {
            this.shop_pirce = shop_pirce;
        }

        public String getShop_image_url() {
            return shop_image_url;
        }

        public void setShop_image_url(String shop_image_url) {
            this.shop_image_url = shop_image_url;
        }
    }
}
