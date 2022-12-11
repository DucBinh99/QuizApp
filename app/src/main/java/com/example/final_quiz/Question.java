package com.example.final_quiz;

public class Question {


        public static String math_hard_questions[] = {
                "1000+2000=3000",
                "2000+3000=5000",
                "3000+3000=1000",
                "4000+4000=8000",
                "5000+5000=10000",
                "4000-4000=2000",
                "2000+2000=3000",
                "4000+5000=8000",
                "3000+5000=8000",
                "8000-5000=1000"
        };

        public static String math_medium_questions[] = {
                "300+100=200",
                "300+200=500",
                "800/800=3",
                "100-90=80",
                "100-80=20",
                "200+200=400",
                "100+900=800",
                "800-800=0",
                "200+400=300",
                "100-100=200"
        };

        public static String math_easy_questions[] = {
                "1+1=2",
                "2+2=3",
                "2+3=1",
                "5+5=10",
                "3+8=10",
                "8+8=15",
                "10+10=1",
                "8+9=89",
                "10+10=90",
                "10+9=18"
        };

        public static String answer_math_hard_questions[] = {"Đúng", "Đúng", "Sai", "Đúng", "Đúng", "Sai", "Sai", "Sai", "Đúng", "Sai"};
        public static String answer_math_medium_questions[] = {"Sai", "Đúng", "Sai", "Sai", "Đúng", "Sai", "Sai", "Đúng", "Sai", "Sai"};
        public static String answer_math_easy_questions[] = {"Đúng", "Sai", "Sai", "Đúng", "Sai", "Sai", "Sai", "Sai", "Sai", "Sai"};

        public static String getMathHardQuestion(int index) {
            return math_hard_questions[index];
        }

        public static String getMathMediumQuestion(int index) {
            return math_medium_questions[index];
        }

        public static String getMathEasyQuestion(int index) {
            return math_easy_questions[index];
        }

        public static String getMathHardAnswer(int index) {
            return answer_math_hard_questions[index];
        }

        public static String getMathMediumAnswer(int index) { return answer_math_medium_questions[index]; }

        public static String getMathEasyAnswer(int index) {
            return answer_math_easy_questions[index];
        }
        public static String art_hard_questions[] = {
                "Quy luật phối cảnh 3D không phải một qui luật được áp dụng trong tranh tĩnh vật",
                " Nguyên lí sắp xếp các họa tiết trang trí trên thảm là đối xứng 2 bên",
                "Khi trang trí thảm hình vuông, không nên sử dụng đường nét uốn lượn",
                "Mảng chính được đặt ở vị trí nửa trên của hình vuông",
                "Phép chiếu vuông góc không phải là một phép đối xứng",
                "Số lượng tâm và trục đối xứng của hình vuông là 1 tâm và 4 trục đối xứng",
                "Các trang trí có tính đối xứng thường có đặc điểm các chi tiết có sự lặp lại giữa các phần đối xứng",
                "Lựa chọn họa tiết trang trí thảm cần căn cứ vào quy trình sản xuất",
                "Đặc điểm chung của các thiết kế nhà ở, tháp, cầu,… là cân bằng đối xứng",
                "Tính chất đối xứng là một định nghĩa phổ biến trong phân môn Hình học"
        };

        public static String art_medium_questions[] = {
                "Để vẽ một bức tranh tĩnh vật màu, cần làm theo 2 bước",
                "Tranh tĩnh vật màu có thể được sử dụng để trang trí nhà cửa, phòng làm việc, góc học tập,…",
                "Hòa sắc là sự pha trộn các màu vs nhau để tạo ra màu mới, thể hiện được dụng ý của người vẽ.",
                "Đối tượng thường xuất hiện trong tranh tĩnh vật là cảnh đường phố",
                "Cách sắp xếp bố cục, màu sắc của mẫu vật trong tranh cần hài hoà, cân đối",
                "Sử dụng ba hoặc nhiều màu sắc nằm cạnh nhau trên Vòng Hòa sắc là phương pháp hoà sắc tương đồng",
                "Sử dụng màu sắc đối diện nhau trên Vòng Hòa sắc là phương pháp hòa sắc bổ sung",
                "Bố cục của tranh tĩnh vật màu dựa trên hình dáng, tỉ lệ các vật mẫu",
                "Thước ngắm không cần thiết khi vẽ một bức tranh tĩnh vật",
                "Hòa sắc hình thoi là một kiểu hòa sắc trong hội họa"
        };

        public static String art_easy_questions[] = {
                "Tranh dân gian có từ lâu đời, do các nghệ nhân nhân gian sáng tạo nên",
                "Tranh “Chợ quê” thuộc dòng tranh dân gian Đông hồ",
                "Tượng đồng có niên đại khoảng năm 850 đến năm 1250 thuộc La Mã cổ đại",
                "Các kim tự tháp Ai Cập được xây dựng từ các loại đá",
                "Đền Abu Simbel không phải một tác phẩm nghệ thuật của Ai Cập cổ đại",
                "Lịch sử Ai Cập cổ đại bắt đầu từ 4000 năm TCN",
                "Kim tự tháp là công trình kiến trúc nổi tiếng của Ai Cập.",
                "Cùng với sự xuất hiện của một số nền văn minh đầu tiên trên thế giời là mĩ thuật thế giới thời tiền sử",
                "Công trình kiến trúc của thế giới cổ đại duy nhất chưa rõ vị trí chính xác là Vườn treo Ba-bi-lon.",
                "Đấu trường La Mã không phải là một di sản mĩ thuật thế giới thời kì cổ đại"
        };

        public static String answer_art_hard_questions[] = {"Đúng", "Đúng", "Sai", "Sai", "Đúng", "Đúng", "Đúng", "Sai", "Đúng", "Đúng"};
        public static String answer_art_medium_questions[] = {"Sai", "Đúng", "Đúng", "Sai", "Đúng", "Đúng", "Đúng", "Đúng", "Đúng", "Đúng"};
        public static String answer_art_easy_questions[] = {"Đúng", "Sai", "Sai", "Đúng", "Sai", "Đúng", "Đúng", "Sai", "Đúng", "Đúng"};

        public static String getArtHardQuestion(int index) {
            return art_hard_questions[index];
        }

        public static String getArtMediumQuestion(int index) {
            return art_medium_questions[index];
        }

        public static String getArtEasyQuestion(int index) {
            return art_easy_questions[index];
        }

        public static String getArtHardAnswer(int index) {
            return answer_art_hard_questions[index];
        }

        public static String getArtMediumAnswer(int index) { return answer_art_medium_questions[index]; }

        public static String getArtEasyAnswer(int index) {
            return answer_art_easy_questions[index];
        }





        public static String geo_hard_questions[] = {
                "Đồng bằng sông Cửu Long có sản lượng thủy sản nuôi trồng lớn nhất nước chủ yếu là do nhiều bãi triều, diện tích mặt nước lớn",
                "Một trong những yếu tố thúc đẩy sự phát triển của ngành thủy sản ở nước ta trong những năm qua là nhu cầu đa dạng của thị trường trong nước và quốc tế",
                "Một trong những yếu tố gây khó khăn cho sự phát triển ngành thủ sản ở nước ta trong những năm qua là sự phát triển của công nghiệp chế biến thủy sản",
                "Hiện nay, nước ta được phân thành 7 vùng nông nghiệp",
                "Cơ cấu công nghiệp theo ngành được thể hiện ở tỉ trọng giá trị sản xuất của từng ngành ( nhóm ngành) trong toàn bộ hệ thống các ngành công nghiệp",
                "Một trong những ngành công nghiệp trọng điểm của nước ta hiện nay là công nghiệp chế biến lương thực, thực phẩm",
                "Cơ cấu của ngành công nghiệp nước ta chuyển dịch không phải do tác động của các thiên tai trong thời giam gần đây",
                "Công nghiệp nước ta phát triển trậm, phân bố phân tán, rời rạc ở Đông Nam Bộ ",
                "Nước ta cần phải chuyển dịch cơ cấu ngành công nghiệp để thích nghi với tình hình chung và hội nhập vào thị trường khu vực và thế giới",
                "Ngành công nghiệp chế biến gỗ và lâm sản không phải là ngàng công nghiệp trọng điểm của nước ta hiện nay"
        };

        public static String geo_medium_questions[] = {
                "Công cuộc Đổi mới nền kinh tế nước ta được bắt đầu từ năm 1986",
                "Nền kinh tế Việt Nam muốn tăng trưởng bền vững chỉ cần có tốc độ tăng trưởng GDP cao",
                "Về cơ bản nền nông nghiệp nước ta là nền nông nghiệp cận xích đạo ",
                "Để tăng sản lượng lương thực ở nước ta, biện pháp quan trọng nhất là mở rộng diện tích đất trồng cây lương thực",
                "Trong những năm qua, sản lựng lương thực của nước ta tăng lên chủ yếu là do tăng năng suất cây trồng",
                "Các loại cây công nghiệp thường được trồng ở vùng đồng bằng là cói, đay, mái, lạc, đậu tương",
                "Vùng Đông bằng sông Cửu Long có sản lượng lương tực lớn hơn vùng Đồng bằng sông Hồng là do có diện tích trồng cây lương thực lớn",
                "Ở nước ta, cây công nghiệp lâu năm được trồng chủ yếu ở miền núi và trung du là do khu vực này có Cơ sở hạ tầng kĩ thuật hiện đại",
                "Một trong những ngư trường trọng điểm của nước ta là Cà Mau – Kiên Giang",
                "Một trong những ngư trường trọng điểm của nước ta là Hải Phòng – Quảng Ninh"
        };

        public static String geo_easy_questions[] = {
                "Châu Á có diện tích đứng thứ 1 trong các châu lục trên thế giới",
                "Các dãy núi ở châu Á có hai hướng chính là đông – tây hoặc gần đông – tây và bắc – nam hoặc gần bắc – nam",
                "Nước ta nằm ở rìa phía đông của bán đảo Đông Dương, gần trung tâm khu vực Đông Nam Á",
                "Điểm cực Đông của nước ta là xã Vạn Thạnh thuộc tỉnh Ninh Thuận",
                "Nước ta nằm trong múi giờ thứ 8",
                "Vùng đất là phần đất liền giáp biển",
                "Đường biên giới dài nhất trên đất liền nước ta là với quốc gia Lào",
                "Nội thủy là vùng nước tiếp giáp với lãnh hải",
                "Trên đất liền, nước ta không có chung biên giới với nước Thái Lan",
                "Nhờ có biển Đông mà nước ta có thiên nhiên nước ta bốn mùa xanh tươi"
        };

        public static String answer_geo_hard_questions[] = {"Đúng", "Đúng", "Sai", "Đúng", "Đúng", "Đúng", "Đúng", "Sai", "Đúng", "Đúng"};
        public static String answer_geo_medium_questions[] = {"Đúng", "Sai", "Sai", "Sai", "Đúng", "Đúng", "Đúng", "Sai", "Đúng", "Đúng"};
        public static String answer_geo_easy_questions[] = {"Đúng", "Đúng", "Đúng", "Sai", "Sai", "Sai", "Đúng", "Sai", "Đúng", "Đúng"};

        public static String getGeoHardQuestion(int index) {
            return geo_hard_questions[index];
        }

        public static String getGeoMediumQuestion(int index) {
            return geo_medium_questions[index];
        }

        public static String getGeoEasyQuestion(int index) {
            return geo_easy_questions[index];
        }

        public static String getGeoHardAnswer(int index) {
            return answer_geo_hard_questions[index];
        }

        public static String getGeoMediumAnswer(int index) { return answer_geo_medium_questions[index]; }

        public static String getGeoEasyAnswer(int index) {
            return answer_geo_easy_questions[index];
        }
        private static String[] his_hard_questions = {
                "Các triều đại phong kiến ở Việt Nam đều theo thể chế quân chủ chuyên chế",
                "Quốc triều hình luật là bộ luật được ban hành dưới triều đại Lê sơ",
                "Bộ quốc sử tiêu biểu của nước ta dưới thời Lê sơ là Đại Việt sử ký",
                "Tập bản đồ tiêu biểu của nước ta dưới thời Nguyễn là Đại Nam nhất thống toàn đồ",
                "Trên cơ sở chữ Hán, người Việt đã sáng tạo ra loại chữ Chữ Nôm",
                "Văn học Đại Việt bao gồm hai bộ phận, đó là văn học dân gian và văn học viết",
                "Kinh đô của Đại Việt dưới thời Lý, Trần và Lê sơ là Thăng Long",
                "Tập bản đồ tiêu biểu của nước ta dưới thời Nguyễn là Dư địa chí",
                "Một trong những cơ sở dẫn đến sự hình thành khối đại đoàn kết dân tộc ở Việt Nam là yêu cầu tập trung lực lượng đấu tranh chống giặc ngoại xâm",
                "Khối đại đoàn kết dân tộc ở Việt Nam được hình thành từ thời Văn Lang - Âu Lạc"
        };

        public static String his_medium_questions[] = {
                "Cuộc Cách mạng công nghiệp lần thứ tư được bắt đầu từ thời gian từ những năm đầu thế kỉ XX",
                "Văn minh Văn Lang - Âu Lạc có cội nguồn từ nền văn hóa Phùng Nguyên",
                "Người đứng đầu Nhà nước Văn Lang là Hùng Vương",
                "Hoạt động kinh tế chủ đạo của cư dân Văn Lang - Âu Lạc là chăn nuôi gia súc lớn",
                "Lương thực chính của cư dân Văn Lang - Âu Lạc là lúa gạo",
                "Khu Liên là người có công lập nên nhà nước Chăm-pa",
                "Một trong những tín ngưỡng bản địa của người Chăm-pa là thờ sinh thực khí",
                "Văn minh Phù Nam có cội nguồn từ nền văn hóa Bàu Tró",
                "Phương tiện đi lại chủ yếu của cư dân Phù Nam là thuyền",
                " Một trong những cơ sở hình thành văn minh Đại Việt là sự kế thừa những nền văn minh cổ trên đất nước Việt Nam"
        };

        public static String his_easy_questions[] = {
                "Lịch sử được hiểu là những gì đã diễn ra trong quá khứ",
                "Hiện thực lịch sử được hiểu là quá trình con người tái hiện lại quá khứ",
                "Sử học là tất cả những gì đã diễn ra trong quá khứ",
                "Đối tượng nghiên cứu của Sử học là toàn bộ quá khứ của loài người",
                "Sử liệu Châu bản triều Nguyễn không phải là sử liệu gốc",
                "Hai nhiệm vụ cơ bản của công tác chuẩn bị sử liệu khi nghiên cứu lịch sử bao gồm sưu tầm sử liệu và xử lí thông tin sử liệu",
                "Cần phải học tập và khám phá lịch sử vì học lịch sử giúp chúng ta hiểu được cội nguồn của bản thân, gia đình, quê hương",
                "Việc học tập lịch sử suốt đời đem lại lợi ích Làm phong phú và đa dạng hiện thực lịch sử",
                "Liên Xô mở đầu kỉ nguyên chinh phục vũ trụ của loài người",
                "Quốc gia đầu tiên đưa con người đặt chân lên Mặt Trăng là Mĩ"
        };

        public static String answer_his_hard_questions[] = {"Đúng", "Đúng", "Sai", "Đúng", "Đúng", "Đúng", "Đúng", "Sai", "Đúng", "Đúng"};
        public static String answer_his_medium_questions[] = {"Sai", "Đúng", "Đúng", "Sai", "Đúng", "Đúng", "Đúng", "Sai", "Đúng", "Đúng"};
        public static String answer_his_easy_questions[] = {"Đúng", "Sai", "Sai", "Đúng", "Sai", "Đúng", "Đúng", "Sai", "Đúng", "Đúng"};

        public static String getHisHardQuestion(int index) {
            return his_hard_questions[index];
        }

        public static String getHisMediumQuestion(int index) {
            return his_medium_questions[index];
        }

        public static String getHisEasyQuestion(int index) {
            return his_easy_questions[index];
        }

        public static String getHisHardAnswer(int index) {
            return answer_his_hard_questions[index];
        }

        public static String getHisMediumAnswer(int index) { return answer_his_medium_questions[index]; }

        public static String getHisEasyAnswer(int index) {
            return answer_his_easy_questions[index];
        }



    public static String sport_hard_questions[] = {
            "Trong kĩ thuật đá bóng bằng lòng bàn chân, khi đá bóng bổng, lòng bàn chân tiếp xúc vào dưới tâm bóng",
            "Trong kĩ thuật đá bóng bằng lòng bàn chân, khi đá bóng lăn sệt, lòng bàn chân tiếp xúc vào ngang tâm bóng",
            "Kĩ thuật dừng bóng bằng đùi thường được sử dụng trong trường hợp dừng bóng lăn sệt",
            "Khi thực hiện tư thế chuẩn bị của kĩ thuật dừng bóng bằng đùi, người tập đứng trong tư thế hai chân đứng song song rộng bằng vai",
            "Quy định về số lượng cầu thủ trong bóng đá 11 người là mỗi đội tối đa 11 người, tính cả thủ môn",
            "Trong 90 phút, mỗi đội được thay thế 4 người",
            "Trong những giải đấu không chính thức, số lượng cầu thủ dự bị được sử dụng thay thế tối đa là 5 cầu thủ?",
            "Mỗi đội được thay cầu thủ trong  2 lần",
            "Thi đấu theo luật bóng đá mini giữa hai đội là của hình thức 5 – 5",
            "Trong một trấn bóng đá quốc tế do Fifa tổ chức, bắt buộc phải có tối thiểu 2 trọng tài"
    };

    public static String sport_medium_questions[] = {
            "Bóng chuyền dùng vợt, lưới, đá cầu",
            "Có 5 cầu thủ trong một đội futsal (bóng đá trong nhà)",
            "Thuật ngữ “bida” bắt nguồn từ Italy",
            "Kích thước của sân thi đấu bóng chuyền là 18 × 10m",
            "Hà Lan có 3 lần vào chung kết, nhưng đều thất bại",
            "Theo FIFA, bóng đá cổ xưa nhất bắt nguồn từ Hy Lạp",
            "FIFA được thành lập năm 1866 và tính đến nay có 210 quốc gia thành viên",
            "Bóng đá được người Pháp đưa vào Việt Nam từ năm 1896",
            "Liên đoàn Bóng đá Việt Nam được thành lập vào năm 1988",
            "Kỹ thuật đá bóng bằng lòng bàn chân được sử dụng nhiều trong chuyền bóng cự li dài"
    };

    public static String sport_easy_questions[] = {
            "Có 9 cầu thủ trong một đội bóng chày",
            "Bóng chuyền được coi là “môn thể thao vua",
            "Amir Khan đã giành được huy chương quyền anh Olympic của mình vào năm 2000",
            "Có 1 mái chèo được sử dụng trong một chiếc thuyền kayak",
            "Kiểu bơi Con bướm không được phép tham gia Thế vận hội",
            "USA có nhiều huy chương vàng Olympic môn bơi lội nhất",
            "Bóng nước được tạo ra vào thế kỷ 18th",
            "Efren Reyes đã vô địch World Pool League 4 lần",
            "Quyền anh trở thành môn thể thao hợp pháp vào năm 1921",
            "Trung tâm bowling lớn nhất nằm ở Singapore"
    };

    public static String answer_sport_hard_questions[] = {"Đúng", "Đúng", "Sai", "Đúng", "Đúng", "Sai", "Sai", "Sai", "Đúng", "Sai"};
    public static String answer_sport_medium_questions[] = {"Sai", "Đúng", "Sai", "Sai", "Đúng", "Sai", "Sai", "Đúng", "Sai", "Sai"};
    public static String answer_sport_easy_questions[] = {"Đúng", "Sai", "Sai", "Đúng", "Sai", "Đúng", "Sai", "Sai", "Sai", "Sai"};

    public static String getSportHardQuestion(int index) {
        return sport_hard_questions[index];
    }

    public static String getSportMediumQuestion(int index) {
        return sport_medium_questions[index];
    }

    public static String getSportEasyQuestion(int index) {
        return sport_easy_questions[index];
    }

    public static String getSportHardAnswer(int index) {
        return answer_sport_hard_questions[index];
    }

    public static String getSportMediumAnswer(int index) { return answer_sport_medium_questions[index]; }

    public static String getSportEasyAnswer(int index) {
        return answer_sport_easy_questions[index];
    }
    public static String bio_hard_questions[] = {
            "Vai trò chung của các nguyên tố vi lượng là hoạt hóa các enzim",
            "Lá cây có màu xanh lục vì các tia sáng màu xanh lục không được diệp lục hấp thụ",
            "Các tilacôit không chứa các sắc tố",
            "Sắc tố tham gia trực tiếp chuyển hóa năng lượng ánh sáng hấp thụ được thành ATP, NADPH trong quang hợp là diệp lục b",
            "Đặc điểm hình thái của lá giúp hấp thụ nhiều tia sáng là diện tích bề mặt lớn",
            "Đặc điểm hình thái của lá giúp CO2 khuếch tán vào lá là trong lớp biểu bì lá có khí khổng",
            "Lá cây có màu xanh lục vì các tia sáng màu xanh lục không được diệp lục hấp thụ",
            "Diệp lục có màu lục vì sắc tố này hấp thụ các tia sáng màu lục",
            "Phần thịt lá nằm liền sát lớp biểu bì trên gồm các tế bào mô giậu",
            "Quang hợp quyết định khoản  90 - 95% năng suất của cây trồng"
    };

    public static String bio_medium_questions[] = {
            "Thoát hơi nước qua lá bằng con đường qua cutin, biểu bì",
            "Thoát hơi nước qua lá qua khí khổng là chủ yếu và lớp cutin là thứ yếu",
            "Vai trò của phôtpho trong cơ thể thực vật là thành phần của axit nucleic, ATP, photpholipit, coenzim; cần cho nở hoa, đậu quả, phát triển rễ",
            "Khi thiếu Photpho, cây có những biểu hiện như sinh trưởng còi cọc, lá có màu vàng",
            "Khi thiếu kali, cây có những biểu hiện như lá màu vàng nhạt, mép lá màu đỏ và có nhiều chấm đỏ trên mặt lá",
            "Vai trò của kali trong cơ thể thực vật là thành phần của protein và axit nucleic",
            "Cây có biểu hiện : lá nhỏ, mềm, mầm đỉnh bị chất là do thiếu canxi",
            "Vai trò chủ yếu của magie trong cơ thể thực vật là thành phần của diệp lục, hoạt hóa enzim",
            "Ở thực vật, nguyên tố dinh dưỡng khoáng thiết yếu lưu huỳnh là nguyên tố đa lượng",
            "Những nguyên tố C,H,O,N,P là nguyên tố đa lượng"
    };

    public static String bio_easy_questions[] = {
            "Rễ cây trên cạn hấp thụ nước và ion muối khoáng chủ yếu qua miền lông hút",
            "Lông hút rất dễ gẫy và sẽ tiêu biến ở môi trường quá nhược trương, quá axit hay thiếu oxi",
            "Sự xâm nhập của nước vào tế bào lông hút theo cơ chế chủ động",
            "Sự hấp thụ ion khoáng thụ động của tế bào rễ cây phụ thuộc vào chênh lệch nồng độ ion",
            "Trong rễ, bộ phận quan trọng nhất giúp cây hút nước và muối khoáng là miền sinh trưởng",
            "Khi tế bào khí khổng no nước thì thành mỏng căng ra làm cho thành dày căng theo, khí khổng mở ra",
            "Khi tế bào khí khổng mất nước thì thành mỏng hết căng ra làm cho thành dày duỗi thẳng, khí khổng đóng lại",
            "Con đường thoát hơi nước qua khí khổng có đặc điểm là vận tốc nhỏ, được điều chỉnh bằng việc đóng mở khí khổng",
            "Quá trình thoát hơi nước qua lá không có vai trò cung cấp năng lượng cho lá",
            "Khi tế bào khí khổng mất nước thì thành mỏng hết căng ra làm cho thành dày duỗi thẳng, khí khổng đóng lại"
    };

    public static String answer_bio_hard_questions[] = {"Đúng", "Đúng", "Sai", "Sai", "Đúng", "Đúng", "Đúng", "Sai", "Đúng", "Đúng"};
    public static String answer_bio_medium_questions[] = {"Sai", "Đúng", "Đúng", "Sai", "Đúng", "Sai", "Đúng", "Đúng", "Đúng", "Đúng"};
    public static String answer_bio_easy_questions[] = {"Đúng", "Sai", "Sai", "Đúng", "Sai", "Đúng", "Đúng", "Sai", "Đúng", "Đúng"};

    public static String getBioHardQuestion(int index) {
        return bio_hard_questions[index];
    }

    public static String getBioMediumQuestion(int index) {
        return bio_medium_questions[index];
    }

    public static String getBioEasyQuestion(int index) {
        return bio_easy_questions[index];
    }

    public static String getBioHardAnswer(int index) {
        return answer_bio_hard_questions[index];
    }

    public static String getBioMediumAnswer(int index) { return answer_bio_medium_questions[index]; }

    public static String getBioEasyAnswer(int index) {
        return answer_bio_easy_questions[index];
    }

    }

