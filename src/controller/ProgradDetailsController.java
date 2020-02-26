package controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import model.Prograd;

@WebServlet(urlPatterns = { "/prograd" })
public class ProgradDetailsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	List<Prograd> list = new ArrayList<Prograd>();

	public ProgradDetailsController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Entering do get");
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/index.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String rate0 = request.getParameter("rating0");
		String rate1 = request.getParameter("rating1");
		String rate2 = request.getParameter("rating2");
		String rate3 = request.getParameter("rating3");
		String rate4 = request.getParameter("rating4");
		String rate5 = request.getParameter("rating5");
		String recom1 = request.getParameter("re1");
		String recom2 = request.getParameter("re2");
		String recom3 = request.getParameter("re3");
		String recom4 = request.getParameter("re4");
		String recom5 = request.getParameter("re5");
		String comment = request.getParameter("comment");
		String submit = request.getParameter("submit");
		String download = request.getParameter("download");

		Prograd prograd = new Prograd(name, id, rate0, recom1, comment);

		prograd.setName(name);
		prograd.setId(id);
		prograd.setComment(comment);

		if (rate0 != null)
			prograd.setRate("0");
		if (rate1 != null)
			prograd.setRate("1");
		if (rate2 != null)
			prograd.setRate("2");
		if (rate3 != null)
			prograd.setRate("3");
		if (rate4 != null)
			prograd.setRate("4");
		if (rate5 != null)
			prograd.setRate("5");

		if (recom1 != null)
			prograd.setRecommand("Very Unlikely");
		if (recom2 != null)
			prograd.setRecommand("Unlikely");
		if (recom3 != null)
			prograd.setRecommand("Moderate");
		if (recom4 != null)
			prograd.setRecommand("Likely");
		if (recom5 != null)
			prograd.setRecommand("Very Likely");

		list.add(prograd);

		if (submit != null) {
			RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/result.jsp");
			rd.forward(request, response);
		}

		if (download != null) {
			response.setContentType("application/octet-stream");
			response.setHeader("Content-Disposition", "attachment;filename=prograd.xlsx");
		}

		try {
			String filename = "C:\\Users\\vinot\\Documents\\excel\\prograd.xls";
			HSSFWorkbook hwb = new HSSFWorkbook();
			HSSFSheet sheet = hwb.createSheet("sheet");
			HSSFRow rowhead = sheet.createRow((short) 0);
			rowhead.createCell((short) 0).setCellValue("Name");
			rowhead.createCell((short) 1).setCellValue("Prograd Id");
			rowhead.createCell((short) 2).setCellValue("Rating");
			rowhead.createCell((short) 3).setCellValue("Recommandation");
			rowhead.createCell((short) 4).setCellValue("Comments");
			
			int i = 0;

			for (Prograd st : list) {
				int j = i + 1;
				HSSFRow row = sheet.createRow((short) j);
				row.createCell((short) 0).setCellValue(st.getName());
				row.createCell((short) 1).setCellValue(st.getId());
				row.createCell((short) 2).setCellValue(st.getRate());
				row.createCell((short) 3).setCellValue(st.getRecommand());
				row.createCell((short) 4).setCellValue(st.getComment());
				i++;
			}

			FileOutputStream out = new FileOutputStream(filename);
			hwb.write(out);
			out.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}