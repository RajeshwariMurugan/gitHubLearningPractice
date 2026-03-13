package demo;

public class WebTable {
   /*
    * 
    *    <html>
    *    <head>
    *      <Style>
    *      <Script>
    *      <title>
    *    </head>
    *    <body>
    *    <div> --> box
    *    <p> -->paragraph
    *    <input> --> input tag
    *    <textarea> --> Address 
    *     <img>  -->images
    *     <a> links
    *     <button> 
    *     
    *     
    *     <table>
    *      <tbody>
    *        <tr>
    *           <th>
    *            <th>
    *            
    *         </tr>
    *         <tr>
    *            <td>
    *            <td>
    *            
    *          </tr>
    *          
    *             <tr>
    *            <td>
    *            <td>
    *            
    *          </tr>
    *      </tbody>
    *  </table>
    *     
    *     
    *     
    *     
    *     
    *     
    *    </body>
    *    </html>
    * */
	
	public static void main(String[] args) {
		
		int arr[][]= {{4,7,8,9},{9,0,6,7}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
