package mate.academy.internetshop.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import mate.academy.internetshop.library.Inject;
import mate.academy.internetshop.model.Item;
import mate.academy.internetshop.service.ItemService;

public class DeleteItemController extends HttpServlet {
    @Inject
    private static ItemService itemService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String itemId = req.getParameter("item_id");
        Item item = itemService.get(Long.valueOf(itemId));
        itemService.getAll().remove(item);
        resp.sendRedirect(req.getContextPath() + "/servlet/getAllItems");
    }
}
