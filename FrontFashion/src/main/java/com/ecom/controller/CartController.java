/*package com.ecom.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.dao.CartDAO;
import com.niit.dao.ProductDAO;
import com.niit.model.CartItem;
import com.niit.model.Product;

@Controller
public class CartController {

	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	CartDAO cartDAO;
	
	@RequestMapping("/cart")
	public String showCart(HttpSession session,Model m)
	{
		
		String username=(String)session.getAttribute("username");
		
		List<CartItem> listCartItems=cartDAO.retrieveCartItems(username);
		m.addAttribute("cartItems",listCartItems);
		m.addAttribute("grandTotal",this.calcGrandTotalValue(listCartItems));
		
		return "Cart";
	}
	
	@RequestMapping("/addToCart/{productid}")
	public String addToCart(@PathVariable("productid") int productid,@RequestParam("qty") int Quantity,HttpSession session,Model m)
	{
		
		Product product=productDAO.getProductById(productid);
		
		CartItem cartItem=new CartItem();
		
		String username=(String)session.getAttribute("username");
		
		cartItem.setProductId(product.getProductid());
		cartItem.setProductName(product.getProductname());
		cartItem.setPrice(product.getPrice());
		cartItem.setQuantity(Quantity);
		cartItem.setPstatus("NP");
		cartItem.setUsername(username);
		
		cartDAO.addCartItem(cartItem);
		
		List<CartItem> listCartItems=cartDAO.retrieveCartItems(username);
		m.addAttribute("cartItems",listCartItems);
		m.addAttribute("grandTotal",this.calcGrandTotalValue(listCartItems));
		
		return "Cart";
	}
	
	public long calcGrandTotalValue(List<CartItem> listCartItems)
	{
		int count=0;
		long grandTotalPrice=0;
		while(count<listCartItems.size())
		{
			grandTotalPrice+=(listCartItems.get(count).getQuantity()*listCartItems.get(count).getPrice());
			count++;
		}
		
		return grandTotalPrice;
	}
	
	@RequestMapping(value="/updateCartItem/{cartItemId}")
	public String updateCartItem(@PathVariable("cartItemId")int cartItemId,@RequestParam("qty")int quantity,Model m,HttpSession session)
	{
		CartItem cartItem=cartDAO.getCartItem(cartItemId);
		cartItem.setQuantity(quantity);
		cartDAO.updateCartItem(cartItem);
		
		String username=(String)session.getAttribute("username");
		
		List<CartItem> listCartItems=cartDAO.retrieveCartItems(username);
		m.addAttribute("cartItems",listCartItems);
		m.addAttribute("grandTotal",this.calcGrandTotalValue(listCartItems));
		
		return "Cart";
	}
	
	@RequestMapping(value="/deleteCartItem/{cartItemId}")
	public String deleteCartItem(@PathVariable("cartItemId")int cartItemId,Model m,HttpSession session)
	{
		CartItem cartItem=cartDAO.getCartItem(cartItemId);
		cartDAO.deleteCartItem(cartItem);
		
		String username=(String)session.getAttribute("username");
		
		List<CartItem> listCartItems=cartDAO.retrieveCartItems(username);
		m.addAttribute("cartItems",listCartItems);
		m.addAttribute("grandTotal",this.calcGrandTotalValue(listCartItems));
		
		return "Cart";
	}
	
	@RequestMapping(value="/checkout")
	public String checkOut(HttpSession session,Model m)
	{

		String username=(String)session.getAttribute("username");
		
		List<CartItem> listCartItems=cartDAO.retrieveCartItems(username);
		m.addAttribute("cartItems",listCartItems);
		m.addAttribute("grandTotal",this.calcGrandTotalValue(listCartItems));
		
		return "OrderDetail";
	}

}
*/