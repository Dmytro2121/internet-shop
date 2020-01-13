package mate.academy.internetshop.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import mate.academy.internetshop.library.Inject;
import mate.academy.internetshop.model.Bucket;
import mate.academy.internetshop.model.Item;
import mate.academy.internetshop.service.BucketService;
import mate.academy.internetshop.service.ItemService;
import mate.academy.internetshop.service.UserService;

public class AddItemToBucketController extends HttpServlet {
    @Inject
    private static BucketService bucketService;
    @Inject
    private static ItemService itemService;
    @Inject
    private static UserService userService;
    private static final Long USER_ID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String itemId = req.getParameter("item_id");
        Item item = itemService.get(Long.valueOf(itemId));
        Bucket bucket = bucketService.getByUserId(USER_ID);
        bucketService.addItem(bucket, item);
        resp.sendRedirect(req.getContextPath() + "/servlet/getAllItems");
    }
}