package test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Order2 {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void  run() {
		
		showMenu();
	}

	private static Map<String, LinkedHashMap<String, Integer>> menu= Item.getMenu();
	//item에서 menu 데이터를 가져옴 
	private static Map<String, LinkedHashMap<String, Integer>> option = Item.getOption();
	//item에서 Option 데이터를 가져옴 
	
	//menu
	private static void showMenu() {
		
		boolean ordering = true;
		boolean firstOrder = true;////첫 주문 확인
		
		while(ordering) {
			List<String> mainMenuItems = new ArrayList<>(menu.keySet());
			//LinkedHashMap menu를 사용해 등록된 순서를 유지하며
			// ArrayList로 바꿔서 입력 번호 직접 연결 가능-> 번호 선택을 구현하기 위해 index 사용필요 
			
			System.out.println("\n[ MAIN MENU ]");
			
			//메뉴목록 출력
			for (int i = 0; i <  mainMenuItems.size(); i++) {
				//items 리스트의 크기만큼 반복 (0번부터 마지막 인덱스까지)   
				System.out.println((i + 1) + ". " + mainMenuItems.get(i));
				//(i + 1) -> 사용자에게는 1번부터 보여주기 위해 인덱스에 +1 / categories.get(i)-> i번째 카테고리 이름
			}
			if (!firstOrder) {////첫 주문 이후 주문
				System.out.println((mainMenuItems.size() + 1) + ". 주문 완료");
			}
		
			System.out.println("주문하실 메뉴의 번호를 입력해 주세요 : ");
			int takeMenuNum = orderAmount();// 숫자 입력 받기, takeMenuNum() 숫자오류 제거 메소드
		
					
			if(takeMenuNum >=1 && takeMenuNum <=  mainMenuItems.size()) {
			//takeMenuNum은 입력한 번호를 1부터 시작->List mainMenuItems에서 시작하기 때문에-1 작성
			String selectedMenu = mainMenuItems.get(takeMenuNum - 1);
			itemMenu(selectedMenu);
			firstOrder = false; // 첫 주문 이후, false로 설정
			}else if(!firstOrder && takeMenuNum == mainMenuItems.size() +1) {
				// 첫 주문 이후에만 "주문 완료" 선택 허용
				ordering =false;
				cart();
			}else {
				System.out.println("잘못된 숫자입지다. 다시 선택하여 주세요. \n");
			}
		}
			
	}//mainMenu end
	
	
	//itemMenu(subMenu)
	private static Map<String, Integer> orderMap = new LinkedHashMap<>();
	//음료이름, 항목별수량 정보 저장
	private static Map<String, Integer> priceMap = new LinkedHashMap<>();
	//음료이름, 음료(음료+토핑) 1잔의 가격정보 저장
	private static Map<String, Map<String, Integer>> toppingMap = new LinkedHashMap<>();
	private static String inNum;
	//메뉴별(string), 토핑과 토핑의갯수(map<string, integer>) 정보를 저장
	
	private static void itemMenu(String subMenu) {
		
		LinkedHashMap<String, Integer> items = menu.get(subMenu);
		//subMenu 에서 해당 목록을 꺼낸 음료의 메뉴, 가격
		//LinkedHashMap을 사용->메뉴등록순서를 유지한 상태, 입력받은 번호의 문자열(subMenu)을 menu에서 가져옴
		
		List<String> subMenuItem = new ArrayList<>(items.keySet());
		// ArrayList로 만들면 정렬된 상태로 리스트에 담음 -> 번호 선택을 구현
		// 키(음료 이름)를 리스트로 변환해서 번호 선택 가능하도록 함
		
		while (true) {
			System.out.println("\n[ "+ subMenu +" MENU ]");
			
			for (int i = 0; i < subMenuItem.size(); i++) {
				 String itemName = subMenuItem.get(i);
				 //List subMenuItem에서 알맞은 i번째의 것을 문자열 itemName으로 선언 
	             int price = items.get(itemName);
	             //Map items 에서 itemName의 것을 가져와서 가격으로 선언 
	             System.out.println((i + 1) + "." + itemName + " : " + price + "원");
			}
			System.out.println((subMenuItem.size() + 1) + ".뒤로가기");
				 
			System.out.print("\n주문하실 메뉴의 번호를 입력해 주세요 : ");
			int takeItemNum = orderAmount();// 숫자 입력 받기, takeItemNum() 숫자오류 제거 메소드
			
			if (takeItemNum >= 1 && takeItemNum <= subMenuItem.size()) {
				//takeItemNum는 입력한 번호를 1부터 시작
				String selectedItem = subMenuItem.get(takeItemNum - 1);
				
				int basePrice = items.get(selectedItem);
				//기본 가격은 선택메뉴에 입력된 가격을 가져옴 
				int totalPrice = basePrice;
				//처음에는 기본 가격만 담음
					 
				String finalItemName = selectedItem;
				//일단 finalItemName에는 선택음료만 저장
				//토핑 선택 후 최종 메뉴 저장예정
				
				
				///ToppingsOption
				Map<String, Integer> takeToppings = new LinkedHashMap<>();
				//토핑 이름, 개수 결과 저장
				
				/// 해당 음료메뉴에 토핑 옵션이 존재할 경우 실행
				if (option.containsKey(selectedItem)) {
					LinkedHashMap<String, Integer> existOption = option.get(selectedItem);
					//메뉴 아이템별로 토핑 옵션과 그 토핑의 가격을 저장 / LinkedHashMap->토핑이 등록된 순서가 유지
					
					List<String> toppingOptions = new ArrayList<>(existOption.keySet());
					//List->토핑 이름들(string)을 인덱스 번호로 접근
					
					
					///토핑옵션의 개수가 2개 이하->option이 ice와 hot만 있는 경우/반드시 1개 선택 중복선택 금지
					// ice선택 경우 얼음 선택사항 추가 가능
					if (toppingOptions.size() <= 2) {
						System.out.println("\n[토핑 Option]");
				
						for (int i = 0; i < toppingOptions.size(); i++) {
							String name = toppingOptions.get(i);
				            int price = existOption.get(name);
							System.out.println((i + 1) + "." +toppingOptions.get(i)+ " (+" + existOption.get(toppingOptions.get(i)) + "원)");
							//toppingOptions.get(i)->토핑 이름 (String)/toppingOptions => List<String>, get(i)는 토핑이름(String)을 반환
							//existOption.get(toppingOptions.get(i))->가격(Integer)/existOption => LinkedHashMap<String, Integer>
							//key = 토핑이름(String),value = 가격(Integer) ->get("토핑이름"), key "토핑이름"에 해당하는 value =>Integer 타입을 반환					
						}
						
						System.out.println("반드시 하나를 선택해주세요. 중복 선택은 불가합니다.");
						
						while (true) {
							System.out.print("옵션 번호를 입력해주세요 : ");
							String inNum = scanner.nextLine().trim();	
							//공백을 제거한 후, 변수 inNum에 저장
							
							if (inNum.isEmpty()) {
								//아무것도 입력하지 않았을 경우
					            System.out.println("하나의 옵션은 반드시 선택해야 합니다.");
					            continue;
					        }
							try {
						         String[] selections = inNum.split(",");
						         //쉼표로 입력기준을 잘라서 저장

						         // 여러 개 선택 시
						         if (selections.length > 1) {
						             System.out.println("중복으로 선택되었습니다. 하나만 입력해 주세요 : ");
						             continue;
						         }

						          
						         int index = Integer.parseInt(selections[0].trim()) - 1;
						          
						         // 입력 번호 범위 확인
						         if (index < 0 || index >= toppingOptions.size()) {
						             System.out.println("번호가 올바르지 않습니다. 다시 선택해 주세요 : ");
						             continue;
						         }

						         //유효한 하나의 선택만 허용→ 토핑 추가 
						         String topping = toppingOptions.get(index);
						         takeToppings.put(topping, 1);
						         // 1개만 선택 가능
						         totalPrice += existOption.get(topping);
						         break; //입력 완료 후 while 탈출

						      } catch (NumberFormatException e) {
					           // 문자나 잘못된 숫자 입력시
					           System.out.println("숫자만 입력해 주세요. 예: 1 또는 2");
						      }
						}//while end
					}
					
					///토핑옵션의 개수가 2개 초과일 경우->중복선택가능, '선택 안 함' 옵션 출력 
					if (toppingOptions.size() > 2) {
						System.out.println((toppingOptions.size() + 1) + ".선택 안 함");
						System.out.println("->쉼표로 중복 선택 가능합니다(예: 1,1,2)");
					}
					
					///토핑 선택
					while (true) {
						System.out.println("\nOption을 선택해 주세요. : ");
									
						try {
							String[] selections = inNum.split(","); 
							// 쉼표로 구분하여 배열로 만듦
							boolean valid = true;
					    
							///모든 선택 번호가 범위 안에 있는지 확인
							for (String sel : selections) {
								//입력된 모든 번호 반복
								int toppingIndex = Integer.parseInt(sel.trim()) - 1;
								// 사용자 입력은 1부터 → 인덱스는 0부터
								if (toppingIndex < 0 || toppingIndex >= toppingOptions.size()) {
									valid = false;
									break;// 범위 밖 번호가 있으면 잘못된 입력으로 처리
								}
							}
							///잘못된 입력 시, 다시 입력받기
							if (!valid) {
								System.out.println("잘못된 입력있습니다. 다시 입력해 주세요. : \\n.");
								continue;				        
							}
							/// 입력이 유효한 경우 -> 토핑 누적 저장
							for (String sel : selections) {
								int toppingIndex = Integer.parseInt(sel.trim()) - 1;
								String topping = toppingOptions.get(toppingIndex);
								takeToppings.put(topping, takeToppings.getOrDefault(topping, 0) + 1);
								totalPrice += existOption.get(topping);
							}
							break;// 유효한 입력 후 while 탈출
							
					    
						} catch (NumberFormatException e) {
							//문자입력시 다시 입력 받기 위해 반복 계속
							System.out.println("잘못된 입력입니다. 숫자만 입력해 주세요(예: 1,1,2)");
						}
					}
				}
				////ToppingsOption end
				
				
				// 수량 입력->1 이상 필수
				int quantity ;
				do {
					System.out.print("메뉴의 수량 입력해주세요(1 이상): ");
					quantity = orderAmount();// 숫자 입력 받기, quantity() 숫자오류 제거 메소드
				} while (quantity <= 0);
				
				// 토핑 정보를 포함한 메뉴 이름 만들기
				if (!takeToppings.isEmpty()) {
					List<String> toppingParts = new ArrayList<>();
					for (Map.Entry<String, Integer> entry : takeToppings.entrySet()){
						toppingParts.add(entry.getKey() + "x" + entry.getValue());
					}
	                finalItemName += " (" + String.join(", ", toppingParts) + ")";
	             // 토핑 정보를 괄호 안에 콤마로 연결하여 메뉴 이름에 붙임
				}
				
				// 기존에 저장된 토핑과 수량이 있다면 누적합산
				if (!takeToppings.isEmpty()) {
				    // 메뉴 이름이 이미 있을 경우, 기존 토핑에 누적 추가
					Map<String, Integer> existingToppings = toppingMap.getOrDefault(finalItemName, new LinkedHashMap<>());
					for (String top : takeToppings.keySet()) {
	                    int newCount = takeToppings.get(top);
	                    existingToppings.put(top, existingToppings.getOrDefault(top, 0) + newCount);
	                }
	                toppingMap.put(finalItemName, existingToppings);
				}

				//ToppingsOption end
				
				// 주문
				orderMap.put(finalItemName, orderMap.getOrDefault(finalItemName, 0) + quantity);
	            priceMap.put(finalItemName, totalPrice);
	            System.out.println( finalItemName + " " + + quantity + "개 추가되었습니다.");
	             	break;
				}else if (takeItemNum ==  subMenuItem.size() + 1) {
					break; 
				}else {
					System.out.println("잘못된 입력입니다.");
			}
		}
	}
	//숫자 입력 헬퍼 ->비즈니스로직 
	private static int orderAmount() {
		while(true) {
			try {//오류가 발생할 수 있는 코드를 작성
				return Integer.parseInt(scanner.nextLine().trim());//Integer.parseInt()->문자열을 정수로 변환/scanner.nextLine()->입력한 문자열을 읽는다 /.trim()->문자열 공백을 제거 /
			} catch(NumberFormatException e) {//숫자가 아닌 값을 입력했을 경우 실행
				System.out.print("상품에 알맞은 숫자로 입력해주세요: ");
			}
		}
	}
	//menu end
	
	// 주문 내역 요약(장바구니)
	private static void cart() {
		int total = 0;
		System.out.println("\n주문 내역 : ");
		
		for (String item : orderMap.keySet()) {
			int quantity = orderMap.get(item);
			// 주문 수량
			int basePrice = priceMap.get(item); 
			// 기본 음료 + 토핑 1잔 기준 가격 (기존 계산값)변경
			int totalToppingPrice = 0;
			Map<String, Integer> toppings = toppingMap.get(item);
			
			// 토핑 금액 재계산 -------------->여기 다시하기
			 int itemTotal = quantity * basePrice;
		        total += itemTotal;
			System.out.printf("- %-30s x %2d = %6d원\n", item, quantity, itemTotal);
			if (toppings != null && !toppings.isEmpty()) {
			    for (Map.Entry<String, Integer> entry : toppings.entrySet()) {
			        System.out.printf("    > %s x%d\n", entry.getKey(), entry.getValue());
			    }
			}
		}
		System.out.println("총 결제예정 금액: " + total + "원");
	}

}
