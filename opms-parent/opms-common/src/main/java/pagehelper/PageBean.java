package pagehelper;

import com.github.pagehelper.Page;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zjj
 * Date : 2017/8/17 16:33
 * Description : 分页对象
 */
@Data
public class PageBean<T> implements Serializable {

    private static final long serialVersionUID = 12121212212123232L;
    private long total; //总记录数
    private List<T> datalist; //结果集
    private int pageNum; //第几页
    private int pageSize; //每页记录数
    private int pages; // 总页数
    private int size; //当前页的数量<=pageSize

    public PageBean(List<T> list){
        if (list instanceof Page){
            Page<T> page = (Page<T>) list;
            this.pageNum = page.getPageNum();
            this.pageSize = page.getPageSize();
            this.total = page.getTotal();
            this.pages = page.getPages();
            this.datalist = page;
            this.size = page.size();
        }
    }

}
